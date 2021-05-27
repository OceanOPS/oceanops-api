import sys
import yaml
from xml.dom import minidom
import xml.etree.ElementTree as ET

if len(sys.argv) > 1:
    excludedEntities = ["Adoption","ApiToken","Basin","BasinType","ContactLogin","CruiseLine",
        "CruisePolygon","Leg","MooringType","Meeting","Doc","DocContact","DocLanguage","DocType","Language",
        "NcLevel","NcTopic","NcNotification","NcSubscription","PackageType","PtfLoc","PtfRefLock","PumpType",
        "SdnPtfClass","Story","TimeInterval","TimePeriod","UpdateTimestamp",
        "WebConnection","WebContactModule","WebContactPreferences","WebDailyQueries","WebDailyVisits","WebFrequentation",
        "WebMessage","WebMetric","WebMetricNetwork","WebModule","WebPtfFilter","WebPtfVisits","WebQuery","WebWorkspace",
        "WmoBlocks",
        "Obs","ObsVariable","ObsArgoGdac","ObsArgoGdacDs","ObsArgoGdacVariable","ObsDataStatus","ObsGlidersGdac","ObsGlidersGdacDs","ObsGlidersGdacVariable",
        "ObsGlidersGtsOsmc","ObsGlidersGtsOsmcVariable","ObsObsDataStatus","ObsTsunaGtsOsmc","ObsTsunaGtsOsmcVariable","ObsStats"]
    excludedProperties = {
        "Contact": ["login", "passwd", "admin", "isPrivate", "greetings"],
        "ProgramContact": ["mzmsWarningEnabled", "mzmsAutoCheck"]
    }
    datamap = minidom.parse(sys.argv[1])

    objEntities = datamap.getElementsByTagName("obj-entity")
    objRelationships = datamap.getElementsByTagName("obj-relationship")


    schemasObj = {}

    for entity in objEntities:
        if entity.attributes['name'].value not in excludedEntities:
            schemasObj[entity.attributes['name'].value] = {'type': 'object'}
            propertyObj = {}
            for prop in entity.getElementsByTagName("obj-attribute"):
                validProp = True
                if entity.attributes['name'].value in excludedProperties:
                    if prop.attributes['name'].value in excludedProperties[entity.attributes['name'].value]:
                        validProp = False
                if validProp:
                    type = "string"
                    format = None
                    if prop.attributes['type'].value in ["java.math.BigDecimal"]:
                        type = "number"
                        format = None
                    if prop.attributes['type'].value in ["java.time.LocalDateTime"]:
                        type = "string"
                        format = "date-time"
                    propertyObj[prop.attributes['name'].value] = {'type': type}
                    if format is not None:
                        propertyObj[prop.attributes['name'].value]['format'] = format
            schemasObj[entity.attributes['name'].value]['properties'] = propertyObj

    for relationship in objRelationships:
        source = relationship.attributes['source'].value
        target = relationship.attributes['target'].value     
        if source not in excludedEntities and target not in excludedEntities:   
            validProp = True
            if source in excludedProperties:
                if target in excludedProperties[source]:
                    validProp = False
            if validProp:
                schemasObj[source]['properties'][relationship.attributes['name'].value] = {'$ref': '#/components/schemas/' + target}
                #schemasObj[relationship.attributes['source'].value]['additionalProperties']['$ref'] = '#/components/schemas/' + relationship.attributes['target'].value


    with open("./src/main/scripts/agrest-protocol.yaml", 'r') as agrestFile:
        with open("./src/main/scripts/oceanops-api_template.yaml", 'r') as file:
            yamlAgrestObj = yaml.safe_load(agrestFile)
            yamlObj = yaml.safe_load(file)
            yamlObj["components"]["schemas"] = schemasObj
            yamlObj["components"]["queryParams"] = yamlAgrestObj["components"]["queryParams"]

            with open('./src/main/resources/oceanops-api.yaml', 'w') as file:
                yaml.dump(yamlObj, file)

