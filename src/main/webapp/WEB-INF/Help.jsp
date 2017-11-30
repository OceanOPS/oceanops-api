<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
		String rootUrl = (String) request.getAttribute("rootUrl");
		String version = (String) request.getAttribute("projectVersion");
		String name = (String) request.getAttribute("projectName");
		String helpEditionDate = (String) request.getAttribute("helpEditionDate");
	%>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<title><%=name%></title>
   	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
   	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"	crossorigin="anonymous">
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	<link rel="stylesheet" href="../styles/main.css">	
</head>
<body>
	<div class="container">
		<div class="page-header">
			<div class="pull-right text-right">Applicable version: <%=version%><br>Last edited: <%=helpEditionDate%></div>
			<h1>
				<%=name%>, documentation
			</h1>
		</div>
		<div class="well">			
			<h2>About the API</h2>
			<p class="text-warning">This is a beta version. The specifications listed below and the results provided by this API are highly susceptible to change.</p>
			<p>
				JCOMMOPS Web Service API is a REST API designed to distribute metadata, in interoperable and ready-to-use formats, 
				to integrate other software (usually under machine to machine schema). 
				The metadata distributed by this API version (V<%=version%>) are in three common data formats: <b>.json</b> and <b>.csv</b>.
			</p>
		</div>

		<div class="container">
			<h2 class="title-border-bottom">Listing the platforms</h2>
			<p>The list of platforms includes platforms' database identifier and their corresponding JCOMMOPS reference.</p>

			<h3>Getting an index of the platforms</h3>
			<p>
				The total list of all the referenced platforms can be obtained with a GET request using the following URL pattern:
				<div class="text-center">
					<span class="url"><%=rootUrl%>platforms.[format]</span>
				</div>
				<br> Where "format" in "platforms.[format]" string path	represents the data output.
			</p>

			<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listAllPtfExample" aria-expanded="false"	aria-controls="listAllPtfExample">Example</button>
			<div class="collapse" id="listAllPtfExample">
				<div class="well">
					To generate the global platforms list in json format, here the
					dedicated URL:<br> <i><%=rootUrl%>platforms.json</i> <br>
					Below is a truncated output of the example URL:
					<pre>
					<code>
						[
						...,
						{"id":507587,"jcommopsRef":"7900372"},
						{"id":507586,"jcommopsRef":"7900373"},
						{"id":507585,"jcommopsRef":"7900374"},
						{"id":507524,"jcommopsRef":"7900375"},
						{"id":506352,"jcommopsRef":"5903904"},
						{"id":506351,"jcommopsRef":"5903959"},
						...
						]
					</code>
				</pre>
				</div>
			</div>
			<br>


			<h3>Listing a filtered list of platforms using key parameters</h3>
			<p>
				A filtered list of platforms can be obtained with a GET request using this URL pattern:
				<div class="text-center">
					<span class="url"><%=rootUrl%>platforms.[format]?parm1=value1&parm2=value2&...</span>
				</div>
				<br>
				Where parm1, parm2…param(i) respresent the query parameters and value1, value2…value(i) represent the corresponding values respectively. 
				Note also that for multiple values selection, each parameter can assign several values separated by comma ",".
			</p>
			<br><br>
			<b>Table 1.</b> Search parameters to specify in the URL.
			<form name="submitPramValues" method="POST">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>Parameter<a href="#params-details">*</a></th>
								<th>Description</th>
								<th>Values</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>status</td>
								<td>The status of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=status" role="button">Get statuses</a></td>
							</tr>
							<tr>
								<td>model</td>
								<td>The model of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=model" role="button">Get models</a></td>
							</tr>
							<tr>
								<td>type</td>
								<td>The type of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=type" role="button">Get types</a></td>
							</tr>
							<tr>
								<td>family</td>
								<td>The family of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=family" role="button">Get families</a></td>
							</tr>
							<tr>
								<td>program</td>
								<td>The affiliation program(s) of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=program" role="button">Get programs</a></td>
							</tr>
							<tr>
								<td>country</td>
								<td>The country involved in the platform-program</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=country" role="button">Get countries</a></td>
							</tr>
							<tr>
								<td>masterProgram</td>
								<td>The affiliation master program(s) of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=masterProgram" role="button">Get master
										programs</a></td>
							</tr>
							<tr>
								<td>network</td>
								<td>The affiliation network of the platform</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=network" role="button">Get networks</a></td>
							</tr>
							<tr>
								<td>variable</td>
								<td>The variable(s) monitored by the platform's sensor(s)</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=variable" role="button">Get variables</a></td>
							</tr>
							<tr>
								<td>sensorModel</td>
								<td>The platform's sensor(s) model(s)</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=sensorModel" role="button">Get sensor models</a></td>
							</tr>
							<tr>
								<td>sensorType</td>
								<td>The platform's sensor(s) type(s)</td>
								<td><a class="btn btn-default btn-block" target="_blank"
									href="?param=sensorType" role="button">Get sensor types</a></td>
							</tr>
							<tr>
								<td>Date fields<a href="#date-based-params-details">**</a></td>
								<td>Date-based filtering fields</td>
								<td>
									<ul>
										<li><code>updateDate</code>: JCOMMOPS' database update date</li>
										<li><code>insertDate</code>: JCOMMOPS' database insert date</li>
									</ul>
								</td>
							</tr>
						</tbody>
					</table>
					<p id="params-details">
						(*) by convention all the parameters' acronym are in small caps for single word parameters, 
						and in lower camel case for acronyms of compound words.<br><br> 
						A search parameter's value corresponds to either an identification number (<b>ID</b>) or a string (such as <b>Short Name</b>). 
						The values that can each parameter take are listed in the corresponding links in table 1 ("Get parameter" button).
					</p>
					<p id="date-based-params-details">
						(**) a date based parameter uses the interval syntax: <code>[</code> or <code>]</code> at the beginning, <code>]</code> or <code>[</code> at the end (respectively inclusive and exclusive behaviors).
						One can provide one or two dates (comma separated) within the parameter. If the interval symbols are ommited, the inclusive behavior will be considered.<br>
						A date should be given in UTC and match the following pattern: YYYY-MM-DDTHH:MI:SS (ISO 8601), e.g. 2017-11-07T09:55:42.<br>
						Interval syntax examples:
						<ul>
							<li><code>[date1</code>: all records where the database value is posterior or equal to date1</li>
							<li><code>]date1</code>: all records where the database value is stricly posterior to date1</li>
							<li><code>[date1,date2]</code>: all records where the database value is between date1 and date2 (included)</li>
							<li><code>[date1,date2[</code>: all records where the database value is between date1 (included) and date2 (excluded)</li>
						</ul>
					</p>
				</div>
			</form>
			<br>

			<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listFilteredPtfExample" aria-expanded="false" aria-controls="listFilteredPtfExample">Example</button>
			<div id="listFilteredPtfExample" class="collapse">
				<div class="well">
					<p>
						To generate the list of <b>operational platforms</b> monitoring the <b>dissolved	oxygen (ID = 33)</b>, here the dedicated URL:
						<div class="text-center">
							<span class="url"><%=rootUrl%>platforms.json?status=OPERATIONAL&variable=33</span>
						</div>
					</p>
					<br><br>
					Below is a truncated output of the example URL:<br>
					<pre>
					<code>
						[
							{
							  "id": 512263,
							  "jcommopsRef": "6902545"
							},
							{
							  "id": 515072,
							  "jcommopsRef": "5904466"
							},
							{
							  "id": 505866,
							  "jcommopsRef": "5903956"
							},
							{
							  "id": 505865,
							  "jcommopsRef": "5903954"
							},
							{
							  "id": 500758,
							  "jcommopsRef": "5903677"
							},
							{
							  "id": 1002782,
							  "jcommopsRef": "6901004"
							},
							... additional results truncated in this example ...
						]
					</code>
				</pre>
					<p>
						In the URL of the example above the parameter "<b>status</b>" has the value of "<b>OPERATIONAL</b>" standing for an "<b>operational platform</b>" 
						and the parameter "<b>variable</b>" has the value of "<b>33</b>" standing for "<b>dissolved oxygen</b>". The previous URL is equivalent to:
					<div class="text-center">
						<span class="url"><%=rootUrl%>platforms.json?status=6&variable=33</span>
					</div>
					Where in this URL we replaced the short name value of the status ("OPERATIONAL") by its corresponding ID ("6").
					</p>
				</div>
			</div>
		</div>

		<div class="container">
			<h2 class="title-border-bottom">Getting the details of a referenced platform</h2>
			<p>
				The platform details include a number of essential metadata on that platform (only some of them are listed in table 1).
				Platform details can be obtained with a GET request using the following dedicated URL pattern:
				<div class="text-center">
					<span class="url"><%=rootUrl%>platforms.format/[ID]</span><br>
				</div>
				<br>
				Where "[ID]" is the database identifier of the platform.
			</p>

			<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#detailsPtfExample" aria-expanded="false"	aria-controls="detailsPtfExample">Example</button>
			<div id="detailsPtfExample" class="collapse">
				<div class="well">
					To generate the details information of platform (id=512263) in json	format. 
					This platform was identified in the previous section's example as "<b>operational</b>" 
					and including a sensor measuring "<b>dissolved oxygen</b>". Here the dedicated URL for this example:
					<div class="text-center">
						<span class="url"><%=rootUrl%>platform.json/512263</span><br>
					</div>
					Below is a truncated output of the example URL:<br>
					<pre>
					<code>
						{
							"id": 512263,
							"age": 1404,
							"configuration": {
							  "cycleTime": 120,
							  "driftPressure": 1200,
							  "iceDetection": 0,
							  "profilePressure": 2000
							},
							"deployment": {
							  "cruiseName": "2014201",
							  "deploymentDate": "2014-01-22T09:44:00Z",
							  "lat": 69.13,
							  "lon": 7.31,
							  "ship": {
							    "callSign": "LDGJ",
							    "commissionedDate": "1991-01-01T00:00:00Z",
							    "country": {
							      "id": 243,
							      "isoCode2": "NO",
							      "isoCode3": "NOR",
							      "name": "Norway",
							      "nameShort": "NORWAY"
							    },
							    "imo": "8915768",
							    "name": "JOHAN HJORT",
							    "ref": "58J3",
							    "shipType": "Research Vessels"
							  }
							},
							"jcommopsDBInsertDate": "2015-09-03T11:29:05Z",
							"jcommopsDBUpdateDate": "2017-11-27T13:06:11Z",
							"jcommopsRef": "6902545",
							"latestLocation": {
							  "date": "2017-11-27T04:13:46Z",
							  "lat": 69.967,
							  "lon": -2.785
							},
							"notificationDate": "2014-01-28T12:51:17Z",
							"program": {
							  "id": 5891,
							  "agencies": {
							    "agency": [
							      {
							        "description": "Institute of Marine Research",
							        "name": "Institute of Marine Research",
							        "nameShort": "IMR"
							      }
							    ]
							  },
							  "contacts": {
							    "contact": [
							      {
							        "id": 4145,
							        "agency": {
							          "description": "Institute of Marine Research",
							          "name": "Institute of Marine Research",
							          "nameShort": "IMR"
							        },
							        "email": "einar.svendsen@imr.no",
							        "firstName": "Einar",
							        "lastName": "Svendsen",
							        "roles": {
							          "role": [
							            {
							              "id": 5,
							              "name": "Principal Investigator",
							              "nameShort": "PI"
							            }
							          ]
							        }
							      },
							      {
							        "id": 10811,
							        "email": "katrin.latarius@awi.de",
							        "firstName": "Katrin",
							        "lastName": "Latarius",
							        "roles": {
							          "role": [
							            {
							              "id": 210,
							              "name": "Delayed-Mode Operator",
							              "nameShort": "DM"
							            }
							          ]
							        }
							      },
							      {
							        "id": 11508,
							        "email": "kjell.arne.mork@imr.no",
							        "firstName": "Kjell Arne",
							        "lastName": "Mork",
							        "roles": {
							          "role": [
							            {
							              "id": 230,
							              "name": "Operations Manager",
							              "nameShort": "OP"
							            }
							          ]
							        }
							      },
							      {
							        "id": 1003741,
							        "email": "grigor.obolensky@euro-argo.eu",
							        "firstName": "Grigor",
							        "lastName": "OBOLENSKY",
							        "roles": {
							          "role": [
							            {
							              "id": 230,
							              "name": "Operations Manager",
							              "nameShort": "OP"
							            }
							          ]
							        }
							      }
							    ]
							  },
							  "country": {
							    "id": 243,
							    "isoCode2": "NO",
							    "isoCode3": "NOR",
							    "name": "Norway",
							    "nameShort": "NORWAY"
							  },
							  "description": "Argo Norway represents the Norwegian contribution to the global Argo program, and is financed by the project NorArgo, A Norwegian Argo Infrastructure - a part of the European and Global Argo infrastructure, funded by the Norwegian Research Council and the Institute of Marine Research (IMR)",
							    "masterProgram": {
							      "id": 0,
							      "name": "Argo",
							      "nameShort": "Argo"
							    },
							    "name": "Argo NORWAY",
							    "nameShort": "Argo_NORWAY"
							  },
							  "ptfModel": {
							    "id": 3,
							    "manufacturer": {
							      "name": "Teledyne Webb Research",
							      "nameShort": "TWR"
							    },
							    "name": "APEX",
							    "nameShort": "APEX",
							    "platformType": {
							      "id": 26,
							      "description": "Profiling float",
							      "name": "Float",
							      "nameShort": "FLOAT",
							      "platformFamily": {
							        "id": 2,
							        "description": "Subsurface profilers",
							        "name": "Subsurface Profiler",
							        "nameShort": "SUB_P"
							      }
							    }
							  },
							  "ptfStatus": {
							    "id": 6,
							    "description": "The platform is emitting a pulse and observations are distributed",
							    "name": "OPERATIONAL",
							    "nameShort": "OPERATIONAL"
							  },
							  "sensorModel": [
							    {
							      "id": 2007,
							      "name": "SBE41CP",
							      "sensorTypes": {
							        "sensorType": [
							          {
							            "id": 330,
							            "description": "CTD Temperature Sensor",
							            "name": "CTD_TEMP",
							            "nameShort": "TEMP"
							          },
							          {
							            "id": 328,
							            "description": "CTD Pressure Sensor",
							            "name": "CTD_PRES",
							            "nameShort": "PRES"
							          },
							          {
							            "id": 329,
							            "description": "CTD Conductivity Sensor",
							            "name": "CTD_CNDC",
							            "nameShort": "CNDC"
							          }
							        ]
							      }
							    },
							    {
							      "id": 2025,
							      "name": "AANDERAA_OPTODE_4330",
							      "nameShort": "OPTODE",
							      "sensorTypes": {
							        "sensorType": [
							          {
							            "id": 332,
							            "description": "Dissolved Oxygen OPTODE Sensor",
							            "name": "OPTODE_DOXY",
							            "nameShort": "OPTODE_DOXY"
							          }
							        ]
							      }
							    },
							    {
							      "id": 2060,
							      "description": "WETLABS optical sensor packages",
							      "name": "ECO_FLBB",
							      "sensorTypes": {
							        "sensorType": [
							          {
							            "id": 347,
							            "description": "Scatterometer BBP Sensor",
							            "name": "BACKSCATTERINGMETER_BBP&lt;nnn&gt;",
							            "nameShort": "BACKSCATTERINGMETER_BBP&lt;nnn&gt;"
							          },
							          {
							            "id": 344,
							            "description": "Fluorometer ChLa Sensor",
							            "name": "FLUOROMETER_CHLA",
							            "nameShort": "FLUOROMETER_CHLA"
							          }
							        ]
							      }
							    }
							  ],
							  "serialRef": "6807",
							  "telecom": {
							    "telecomNum": "8980",
							    "telecomType": "IRIDIUM"
							  },
							  "variables": {
							    "variable": [
							      {
							        "id": 1,
							        "argoRef": "PSAL",
							        "cfRef": "sea_water_salinity",
							        "name": "Subsurface Salinity",
							        "nameShort": "SUB_SAL",
							        "wigosRef": 91
							      },
							      {
							        "id": 31,
							        "argoRef": "TEMP",
							        "cfRef": "sea_water_temperature",
							        "name": "Subsurface Temperature",
							        "nameShort": "SUB_T",
							        "wigosRef": 94
							      },
							      {
							        "id": 3,
							        "argoRef": "PRES",
							        "cfRef": "sea_water_pressure",
							        "name": "Subsurface Pressure",
							        "nameShort": "SUB_PRESS",
							        "wigosRef": 18
							      },
							      {
							        "id": 33,
							        "argoRef": "DOXY",
							        "cfRef": "moles_of_oxygen_per_unit_mass_in_sea",
							        "name": "Dissolved Oxygen",
							        "nameShort": "DOXY",
							        "wigosRef": 87
							      }
							    ]
							  }
							}
					</code>
				</pre>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
</body>
</html>