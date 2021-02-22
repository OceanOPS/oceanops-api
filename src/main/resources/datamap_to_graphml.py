import sys
from xml.dom import minidom
import xml.etree.ElementTree as ET

if len(sys.argv) > 1:
    datamap = minidom.parse(sys.argv[1])

    graphml = ET.Element("{http://graphml.graphdrawing.org/xmlns}graphml")
    graph = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}graph")
    graph.set("edgedefault", "directed")
    graph.set("id", "G")
    


    objEntities = datamap.getElementsByTagName("obj-entity")
    objRelationships = datamap.getElementsByTagName("obj-relationship")

    d = 0
    
    keyGraphDescriptionID = "d" + str(d)
    keyGraphDescription = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}key")
    keyGraphDescription.set("for", "graph")
    keyGraphDescription.set("id", keyGraphDescriptionID)
    keyGraphDescription.set("attr.name", "Description")
    keyGraphDescription.set("attr.type", "string")
    d = d + 1
    
    keyShapeNode = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}key")
    keyShapeNodeID = "d" + str(d)
    keyShapeNode.set("for", "node")
    keyShapeNode.set("id", keyShapeNodeID)
    keyShapeNode.set("yfiles.type", "nodegraphics")
    d = d + 1
    
    keyNodeDescriptionID = "d" + str(d)
    keyNodeDescription = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}key")
    keyNodeDescription.set("for", "node")
    keyNodeDescription.set("id", keyNodeDescriptionID)
    keyNodeDescription.set("attr.name", "description")
    keyNodeDescription.set("attr.type", "string")
    d = d + 1

    keyPolyLineEdge = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}key")
    keyPolyLineEdgeID = "d" + str(d)
    keyPolyLineEdge.set("for", "edge")
    keyPolyLineEdge.set("id", keyPolyLineEdgeID)
    keyPolyLineEdge.set("yfiles.type", "edgegraphics")
    d = d + 1
    
    keyEdgeDescriptionID = "d" + str(d)
    keyEdgeDescription = ET.SubElement(graphml, "{http://graphml.graphdrawing.org/xmlns}key")
    keyEdgeDescription.set("for", "edge")
    keyEdgeDescription.set("id", keyEdgeDescriptionID)
    keyEdgeDescription.set("attr.name", "description")
    keyEdgeDescription.set("attr.type", "string")
    d = d + 1

    dataKeyGraph = ET.SubElement(graph, "data")
    dataKeyGraph.set("key", keyGraphDescriptionID)

    for entity in objEntities:
        node = ET.SubElement(graph, "{http://graphml.graphdrawing.org/xmlns}node")
        node.set("id", entity.attributes['name'].value)
        dataNode = ET.SubElement(node, "{http://graphml.graphdrawing.org/xmlns}data")
        dataNode.set("key", keyNodeDescriptionID)
        dataNode = ET.SubElement(node, "{http://graphml.graphdrawing.org/xmlns}data")
        dataNode.set("key", keyShapeNodeID)
        shapeNode = ET.SubElement(dataNode,"{http://www.yworks.com/xml/graphml}ShapeNode")
        label = ET.SubElement(shapeNode,"{http://www.yworks.com/xml/graphml}NodeLabel")
        label.text = entity.attributes['name'].value

    for relationship in objRelationships:
        edge = ET.SubElement(graph, "{http://graphml.graphdrawing.org/xmlns}edge")
        edge.set("id", relationship.attributes['source'].value + "-" + relationship.attributes['name'].value)
        edge.set("source", relationship.attributes['source'].value)
        edge.set("target", relationship.attributes['target'].value)
        dataEdge = ET.SubElement(edge, "{http://graphml.graphdrawing.org/xmlns}data")
        dataEdge.set("key", keyEdgeDescriptionID)
        dataEdge = ET.SubElement(edge, "{http://graphml.graphdrawing.org/xmlns}data")
        dataEdge.set("key", keyPolyLineEdgeID)
        polyLineEdge = ET.SubElement(dataEdge,"{http://www.yworks.com/xml/graphml}PolyLineEdge")
        label = ET.SubElement(polyLineEdge,"{http://www.yworks.com/xml/graphml}EdgeLabel")
        label.text = relationship.attributes['name'].value

    ET.register_namespace('xsi',"http://www.w3.org/2001/XMLSchema-instance")
    ET.register_namespace('',"http://graphml.graphdrawing.org/xmlns")
    ET.register_namespace("java","http://www.yworks.com/xml/yfiles-common/1.0/java")
    ET.register_namespace("sys","http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0")
    ET.register_namespace("x", "http://www.yworks.com/xml/yfiles-common/markup/2.0")
    ET.register_namespace("y", "http://www.yworks.com/xml/graphml")
    ET.register_namespace("yed", "http://www.yworks.com/xml/yed/3")
    graphml.set('{http://www.w3.org/2001/XMLSchema-instance}schemaLocation',"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd")

    
    tree = ET.ElementTree(graphml)

    tree.write("datamap_graphml.graphml",
            xml_declaration=True, encoding='utf-8',
            method="xml")

