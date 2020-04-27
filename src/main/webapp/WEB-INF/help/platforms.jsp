<p>The list of platforms includes platforms' database identifier, their corresponding JCOMMOPS reference and their WIGOS identifier when allocated.</p>
			
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
			{"id":1024171,"jcommopsRef":"5902435","wigosRef":"0-22000-0-5902435"},
			{"id":1024170,"jcommopsRef":"5902434","wigosRef":"0-22000-0-5902434"},
			{"id":1024168,"jcommopsRef":"5902433","wigosRef":"0-22000-0-5902433"},
			{"id":1106132,"jcommopsRef":"1500608_101","wigosRef":"0-22000-101-1500608"},
			{"id":1118420,"jcommopsRef":"5401638_100","wigosRef":"0-22000-100-5401638"},
			{"id":512207,"jcommopsRef":"6200151","wigosRef":""},
			...
			]
		</code>
	</pre>
	</div>
</div>
<br>


<h3>Filtering the list using key parameters</h3>
<p>
	A filtered list of platforms can be obtained with a GET request using this URL pattern:
	<div class="text-center">
		<span class="url"><%=rootUrl%>platforms.[format]?parm1=value1&parm2=value2&...</span>
	</div>
	<br>
	Where parm1, parm2...param(i) respresent the query parameters and value1, value2...value(i) represent the corresponding values respectively. 
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
			(**) a date based parameter uses the interval syntax: <code>[</code> (HTML URL code: %5B) or <code>]</code> (HTML URL code: %5D) at the beginning, <code>]</code> or <code>[</code> at the end (respectively inclusive and exclusive behaviors).
			One can provide one or two dates (comma separated) within the parameter. If the interval symbols are ommited, the inclusive behavior will be considered.<br>
			A date should be given in UTC and match the following pattern: YYYY-MM-DDTHH:MI:SS (ISO 8601), e.g. 2019-02-22T22:30:25.<br>
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
				{"id":1113620,"jcommopsRef":"5905379","wigosRef":"0-22000-0-5905379"},
				{"id":1120793,"jcommopsRef":"6902905","wigosRef":"0-22000-0-6902905"},
				{"id":1120795,"jcommopsRef":"5904847","wigosRef":"0-22000-0-5904847"},
				{"id":1120797,"jcommopsRef":"5905993","wigosRef":"0-22000-0-5905993"},
				{"id":1120796,"jcommopsRef":"5905992","wigosRef":"0-22000-0-5905992"},
				{"id":1120799,"jcommopsRef":"5905995","wigosRef":"0-22000-0-5905995"},
				{"id":1024000,"jcommopsRef":"5904660","wigosRef":"0-22000-0-5904660"},
				{"id":1120798,"jcommopsRef":"5905994","wigosRef":"0-22000-0-5905994"}
				...
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

<h3>Getting the details of a referenced platform</h3>
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
		and including a sensor measuring "<b>dissolved oxygen</b>". Here the dedicated URLs for this example:
		<div class="text-center">
			<span class="url"><%=rootUrl%>platforms.json/512263</span><br>
			<span class="url"><%=rootUrl%>platforms.json/ref/6902545</span><br>
		</div>
		Below is a formatted output of the example URL:<br>
		<pre>
			<code>
				{
					"id":512263,
					"age":2278,
					"configuration":{
					   "cycleTime":120,
					   "driftPressure":1200,
					   "iceDetection":0,
					   "profilePressure":2000
					},
					"deployment":{
					   "cruiseName":"2014201",
					   "deploymentDate":"2014-01-22T09:44:00Z",
					   "lat":69.13,
					   "lon":7.31,
					   "ship":{
						  "callSign":"LDGJ",
						  "commissionedDate":"1991-01-01T00:00:00Z",
						  "country":{
							 "id":243,
							 "isoCode2":"NO",
							 "isoCode3":"NOR",
							 "name":"Norway",
							 "nameShort":"NORWAY"
						  },
						  "imo":"8915768",
						  "name":"JOHAN HJORT",
						  "ref":"58J3",
						  "shipType":"Research Vessels"
					   }
					},
					"jcommopsDBInsertDate":"2015-09-03T11:29:05Z",
					"jcommopsDBUpdateDate":"2020-04-14T10:21:05Z",
					"jcommopsRef":"6902545",
					"latestLocation":{
					   "date":"2020-01-30T02:28:27Z",
					   "lat":67.377,
					   "lon":3.16
					},
					"notificationDate":"2014-01-28T12:51:17Z",
					"program":{
					   "id":5891,
					   "agencies":{
						  "agency":[
							 {
								"description":"Institute of Marine Research",
								"name":"Institute of Marine Research",
								"nameShort":"IMR"
							 }
						  ]
					   },
					   "contacts":{
						  "contact":[
							 {
								"id":10811,
								"email":"katrin.latarius@awi.de",
								"firstName":"Katrin",
								"lastName":"Latarius",
								"roles":{
								   "role":[
									  {
										 "id":210,
										 "name":"Delayed-Mode Operator",
										 "nameShort":"DM"
									  }
								   ]
								}
							 },
							 {
								"id":11508,
								"email":"kjell.arne.mork@hi.no",
								"firstName":"Kjell Arne",
								"lastName":"Mork",
								"roles":{
								   "role":[
									  {
										 "id":5,
										 "name":"Principal Investigator",
										 "nameShort":"PI"
									  },
									  {
										 "id":62,
										 "name":"Program Manager",
										 "nameShort":"PM"
									  }
								   ]
								}
							 },
							 {
								"id":1003741,
								"email":"grigor.obolensky@euro-argo.eu",
								"firstName":"Grigor",
								"lastName":"OBOLENSKY",
								"roles":{
								   "role":[
									  {
										 "id":230,
										 "name":"Operations Manager",
										 "nameShort":"OP"
									  }
								   ]
								}
							 },
							 {
								"id":1003786,
								"email":"romain.cancouet@euro-argo.eu",
								"firstName":"Romain",
								"lastName":"CANCOUËT ",
								"roles":{
								   "role":[
									  {
										 "id":230,
										 "name":"Operations Manager",
										 "nameShort":"OP"
									  }
								   ]
								}
							 },
							 {
								"id":1008110,
								"agency":{
								   "description":"Institute of Marine Research",
								   "name":"Institute of Marine Research",
								   "nameShort":"IMR"
								},
								"email":"henrik.soiland@hi.no",
								"firstName":"Henrik",
								"lastName":"Søiland",
								"roles":{
								   "role":[
									  {
										 "id":230,
										 "name":"Operations Manager",
										 "nameShort":"OP"
									  }
								   ]
								}
							 }
						  ]
					   },
					   "country":{
						  "id":243,
						  "isoCode2":"NO",
						  "isoCode3":"NOR",
						  "name":"Norway",
						  "nameShort":"NORWAY"
					   },
					   "description":"<span style=\"color: rgb(51, 51, 51); font-family: arial, verdana, helvetica, sans-serif; font-size: 12px;\">Argo Norway represents the Norwegian contribution to the global Argo program, and is financed by the project NorArgo, A Norwegian Argo Infrastructure - a part of the European and Global Argo infrastructure, funded by the&nbsp;</span><a href=\"http://www.forskningsradet.no/\" style=\"color: rgb(127, 136, 0); outline: none; font-family: arial, verdana, helvetica, sans-serif; font-size: 12px;\">Norwegian Research Council</a><span style=\"color: rgb(51, 51, 51); font-family: arial, verdana, helvetica, sans-serif; font-size: 12px;\">&nbsp;and the&nbsp;</span><a href=\"http://www.imr.no/\" style=\"color: rgb(127, 136, 0); outline: none; font-family: arial, verdana, helvetica, sans-serif; font-size: 12px;\">Institute of Marine Research (IMR)</a>",
					   "name":"Argo NORWAY",
					   "nameShort":"Argo_NORWAY",
					   "network":{
						  "id":1000620,
						  "description":"Argo (GOOS/JCOMM)",
						  "name":"Argo",
						  "nameShort":"Argo"
					   }
					},
					"ptfModel":{
					   "id":3,
					   "manufacturer":{
						  "name":"Teledyne Webb Research",
						  "nameShort":"TWR"
					   },
					   "name":"APEX",
					   "nameShort":"APEX",
					   "platformType":{
						  "id":26,
						  "description":"Profiling float",
						  "name":"Float",
						  "nameShort":"FLOAT",
						  "platformFamily":{
							 "id":2,
							 "description":"Subsurface profilers",
							 "name":"Subsurface Profiler",
							 "nameShort":"SUB_P"
						  }
					   }
					},
					"ptfStatus":{
					   "id":6,
					   "description":"The platform is emitting a pulse and observations are distributed",
					   "name":"OPERATIONAL",
					   "nameShort":"OPERATIONAL"
					},
					"sensorModel":[
					   {
						  "id":2007,
						  "name":"SBE41CP",
						  "sensorTypes":{
							 "sensorType":[
								{
								   "id":328,
								   "description":"CTD Pressure Sensor",
								   "name":"CTD_PRES",
								   "nameShort":"PRES"
								},
								{
								   "id":329,
								   "description":"CTD Conductivity Sensor",
								   "name":"CTD_CNDC",
								   "nameShort":"CNDC"
								},
								{
								   "id":330,
								   "description":"CTD Temperature Sensor",
								   "name":"CTD_TEMP",
								   "nameShort":"TEMP"
								}
							 ]
						  }
					   },
					   {
						  "id":2025,
						  "name":"AANDERAA_OPTODE_4330",
						  "nameShort":"OPTODE",
						  "sensorTypes":{
							 "sensorType":[
								{
								   "id":332,
								   "description":"Dissolved Oxygen OPTODE Sensor",
								   "name":"DOXY_OPTODE",
								   "nameShort":"OPTODE_DOXY"
								}
							 ]
						  }
					   },
					   {
						  "id":2060,
						  "description":"WETLABS optical sensor packages",
						  "name":"ECO_FLBB",
						  "sensorTypes":{
							 "sensorType":[
								{
								   "id":344,
								   "description":"Fluorometer ChLa Sensor",
								   "name":"FLUOROMETER_CHLA",
								   "nameShort":"FLUOROMETER_CHLA"
								},
								{
								   "id":347,
								   "description":"Scatterometer BBP Sensor",
								   "name":"BACKSCATTERINGMETER_BBP<nnn>",
								   "nameShort":"BACKSCATTERINGMETER_BBP<nnn>"
								}
							 ]
						  }
					   }
					],
					"serialRef":"6807",
					"telecom":{
					   "telecomNum":"8980",
					   "telecomType":"IRIDIUM"
					},
					"variables":{
					   "variable":[
						  {
							 "id":12235,
							 "argoRef":"RPHASE_DOXY",
							 "name":"Rphase Doxy",
							 "p01Ref":"SDN:P01::OXYCPHAR"
						  },
						  {
							 "id":1,
							 "argoRef":"PSAL",
							 "cfRef":"sea_water_salinity",
							 "name":"Subsurface Salinity",
							 "nameShort":"SUB_SAL",
							 "wigosCode":"91"
						  },
						  {
							 "id":12244,
							 "argoRef":"TEMP_CPU_CHLA",
							 "name":"Temp Cpu Chla",
							 "p01Ref":"SDN:P01::TCNTICPU"
						  },
						  {
							 "id":3,
							 "argoRef":"PRES",
							 "cfRef":"sea_water_pressure",
							 "name":"Subsurface Pressure",
							 "nameShort":"SUB_PRESS",
							 "wigosCode":"18"
						  },
						  {
							 "id":4222,
							 "argoRef":"CHLA",
							 "cfRef":"mass_concentration_of_chlorophyll_a_in_sea_water",
							 "name":"Chlorophyll A",
							 "nameShort":"CHLA"
						  },
						  {
							 "id":12184,
							 "argoRef":"TEMP_DOXY",
							 "cfRef":"temperature_of_sensor_for_oxygen_in_sea_water",
							 "name":"Temperature Of Sensor For Oxygen In Sea Water"
						  },
						  {
							 "id":33,
							 "argoRef":"DOXY",
							 "cfRef":"moles_of_oxygen_per_unit_mass_in_sea_water",
							 "name":"Oxygen",
							 "nameShort":"DOXY",
							 "wigosCode":"87"
						  },
						  {
							 "id":12229,
							 "argoRef":"TPHASE_DOXY",
							 "name":"Tphase Doxy",
							 "p01Ref":"SDN:P01::OXYCPHAC"
						  },
						  {
							 "id":31,
							 "argoRef":"TEMP",
							 "cfRef":"sea_water_temperature",
							 "name":"Subsurface Temperature",
							 "nameShort":"SUB_T",
							 "wigosCode":"94"
						  },
						  {
							 "id":12242,
							 "argoRef":"BETA_BACKSCATTERING700",
							 "name":"Beta Backscattering700",
							 "p01Ref":"SDN:P01::NVLTOBS1"
						  },
						  {
							 "id":12243,
							 "argoRef":"FLUORESCENCE_CHLA",
							 "name":"Fluorescence Chla",
							 "p01Ref":"SDN:P01::FCNTRW01"
						  },
						  {
							 "id":12252,
							 "argoRef":"BBP700",
							 "name":"Bbp700",
							 "p01Ref":"SDN:P01::BB117NIR"
						  }
					   ]
					}
				 }
			</code>
		</pre>
	</div>
</div>