<p>
	The main endpoints to access entites metadata are documented in the OpenAPI 3.0 specification and discoverable through the Swagger UI 
	(see <a href="#concepts-api-organisation">Concepts & API organisation</a>), 
	but the following section will guide and provide examples of usage through the 'platform' entity.
</p>
<h3>JSON format</h3>
<div class="well">
URL endpoint: <code>/<%=entityPath%>/platform</code>
</div>
<p>
	Everything described in this area of the documentation is applicable to every JSON endpoints. 
	The different capabilities will be described for the platform entity, but applicable to others.
</p>

<p>
	This endpoint will display a list of platform JSON records including all the leaf-fields of the platform entity by default as well as the count of returned records.
	<div class="text-center">
		<span class="url"><%=rootUrl%><%=entityPath%>/platform</span>
	</div>
</p>
<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listAllPtfExample" aria-expanded="false"	aria-controls="listAllPtfExample">Example</button>
<div class="collapse" id="listAllPtfExample">
	<div class="well">
		URL to generate the global platforms list in JSON format:<br> <i><%=rootUrl%><%=entityPath%>/platforms</i> <br>
		Below is a truncated output:
		<pre>
		<code>
			{
				"data":[
				...
				{"id":513482,"activityCriterion":30,"age":2430.9928,"ageWeight":0.64,"closureCriterion":1825,"description":null,"eNotificationDate":"2014-06-04T12:21:10", ...},
				{"id":515591,"activityCriterion":30,"age":2331.4632,"ageWeight":0.64,"closureCriterion":1825,"description":"typo in deployment year fixed. (2104/2014)","eNotificationDate":"2015-02-12T09:59:02", ...},
				{"id":514158,"activityCriterion":30,"age":2390.8477,"ageWeight":0.64,"closureCriterion":1825,"description":null,"eNotificationDate":"2014-07-21T13:26:25", ...},
				...
				]
				"total": 154 
			}
		</code>
	</pre>
	</div>
</div>
<br>
<br>

<h4>Filtering the list using an expression</h4>
<p>
	A filtered index of platforms can be obtained with a GET request using the <code>exp</code> query parameter:
	<div class="text-center">
		<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["field1 = 'value' and field2.subfield='anotherValue'"]</span>
	</div>
	<br>
	Where field1 respresents a leaf field of the platform entity and field2.subfield a field accessed through a related entity.
	The <code>exp</code> query parameter should specify a SQL like where clause, using the leaf fields or relationships. 
</p>
<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listFilteredPtfExample" aria-expanded="false" aria-controls="listFilteredPtfExample">Example</button>
<div id="listFilteredPtfExample" class="collapse">
	<div class="well">
		<p>
			To generate the index of <b>operational platforms</b> monitoring the <b>dissolved oxygen (ID = 33)</b>, here is the dedicated URL:
			<div class="text-center">
				<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["ptfStatus.name='OPERATIONAL' and ptfVariables.variable.nameShort='DOXY'"]</span>
			</div>
			<br>
			In the URL of the example above the parameter "<b>ptfStatus.name</b>" has the value of "<b>OPERATIONAL</b>" standing for an "<b>operational platform</b>" 
			and the parameter "<b>ptfVariables.variable.nameShort</b>" has the value of "<b>DOXY</b>" standing for "<b>dissolved oxygen</b>". The previous URL is equivalent to:
			<div class="text-center">
				<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["ptfStatus.id=6 and ptfVariables.variable.id=33"]</span>
			</div>
			Where in this URL we replaced the short name value of the status ("OPERATIONAL") by its corresponding ID ("6") and the short name value 'DOXY' by its corresponding ID ("33").
		</p>
		<p>
			To generate the index of <b>operational platforms</b> monitoring under the <b>VOS programme</b>, here is the dedicated URL:
			<div class="text-center">
				<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["ptfStatus.name='OPERATIONAL' and networkPtfs.network.name='VOS'"]</span>
			</div>
		</p>
	</div>
</div>
<br>
<br>

<h4 id="get-platform-details">Getting the details of a referenced platform</h4>
<p>
	The list of platform could be reduced to one record, making it a direct access to a single entity.
	There is however shortcut URLs to access platform's details.
	Platform's details can be obtained with a GET request using the following dedicated URL pattern:
	<div class="text-center">
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/[ID]</span><br>
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/ref/[REF]</span><br>
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/wigosid/[WIGOS ID]</span><br>
	</div>
	<br>
	Where (replace the squared brackets as well "[]"): 
	<ul>
		<li>"[ID]" is the database identifier of the platform;</li>
		<li>"[REF]" is the OceanOPS' reference of the platform;</li>
		<li>"[WIGOS ID]" is the WIGOS identifier of the platform.</li>
	</ul>
</p>

<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#detailsPtfExample" aria-expanded="false"	aria-controls="detailsPtfExample">Example</button>
<div id="detailsPtfExample" class="collapse">
	<div class="well">
		To generate the details information of platform (id=512263) in json	format. Here the dedicated URLs for this example:
		<div class="text-center">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/512263</span><br>
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/ref/6902545</span><br>
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/wigosid/0-22000-0-6902545</span><br>
		</div>
	</div>
</div>
<br>
<br>

<h4>Formatting</h4>
<p>
	<em>The include/exclude query parameters</em> can be used to specify which leaf field or related object should be included/excluded in the result.
	Specify one or several leaf fields in the include parameter will restrict the result to what is specified. 
	If specifying only a related object, the relation will be added to all the leaf fields.
</p>
<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#includeExcludeExample" aria-expanded="false"	aria-controls="includeExcludeExample">Example</button>
<div id="includeExcludeExample" class="collapse">
	<div class="well">
		To generate the details information of platform (ref=6902545) including only the deployment ship, its status and the reference:
		<div class="text-center">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/ref/6902545?include=["ptfDepl.ship.name", "ref", "ptfStatus.name"]</span>
			<pre>
				<code>
				{
					"data": [
						{
							"ptfDepl": {
								"ship": {
									"name": "JOHAN HJORT",
								}
							},
							"ptfStatus": {
								"name": "INACTIVE"
							},
							"ref": "6902545"
						}
					],
					"total": 1
				}
				</code>
			</pre>
		</div>
	</div>
</div>
<p>
	More details on the <a href="https://agrest.io/protocol/#shaping-collection-with-include-exclude" target="_blank">AgRest documentation</a>.
</p>
<br>
<p>
	<em>The mapBy query parameter</em> can by used to group the result by a given parameter.
</p>
<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#mapByExample" aria-expanded="false"	aria-controls="mapByExample">Example</button>
<div id="mapByExample" class="collapse">
	<div class="well">
		To generate the list of Italian operational platforms and group them by their programme name:
		<div class="text-center">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/?exp=["ptfStatus.name='OPERATIONAL' and program.country.code2='IT'"]&include=["ref", "ptfStatus.name"]&mapBy=program.name</span>
			<pre>
				<code>
					{
						"data": {
							"Argo ITALY": [
							...
							],
							"ITALY-OGS": [
							...
							],
							"MOCCA-IT": [
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "3901849"
								},
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "3901978"
								},
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "3901908"
								}
							],
							"ITALY DB": [
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "1701600_100"
								},
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "5501611_100"
								}
							],
							"HF Italy": [
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "TMP-1320837742"
								},
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "TMP-1127214070"
								},
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "TMP-1033284844"
								}
							],
							"OS-OGS": [
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "6100278_015"
								}
							],
							"OS-CNR": [
								{
									"ptfStatus": {
										"name": "OPERATIONAL"
									},
									"ref": "TMP7KEUQKZPI3"
								}
							]
						},
						"total": 97
					}
				</code>
			</pre>
		</div>
	</div>
</div>
<p>
	More details on the <a href="https://agrest.io/protocol/#structuring-collection-with-mapby" target="_blank">AgRest documentation</a>.
</p>
<br>

<h4>Frequent queries</h4>
<ul>
	<li>
		All operational Argo floats:
		<div class="text-center" data-toggle="collapse" data-target="#frequentQuery1" role="button">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/?exp=["ptfStatus.name='OPERATIONAL' and networkPtfs.network.name='Argo'"]</span>
		</div>
		<div id="frequentQuery1" class="collapse">
			<pre>
				{"data":[
					...
					],
				"total": 3904}
			</pre>
		</div>
	</li>
	<li>
		All inactive DBCP surface drifters:
		<div class="text-center" data-toggle="collapse" data-target="#frequentQuery2" role="button">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["ptfStatus.name='INACTIVE' and networkPtfs.network.nameShort='DBCP' and ptfModel.ptfType.ptfFamily.name = 'Drifting Buoy'"]</span>
		</div>
		<div id="frequentQuery2" class="collapse">
			<pre>
				{"data":[
					...
					],
				"total": 214}
			</pre>
		</div>
	</li>
	<li>
		All elements having 'CFO383' as GTS identifier (WMO code/ID), resulting only the platform reference, and their opened GTS identifier record (no end date, if any):
		<div class="text-center" data-toggle="collapse" data-target="#frequentQuery3" role="button">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["wmos.wmo = 'CFO383'"]&include=["ref",{"path":"wmos","exp":"endDate = null"},{"wmos":["wmo","startDate", "endDate"]}]</span>
		</div>
		<div id="frequentQuery3" class="collapse">
		<pre>
			{"data":[
				{"ref":"VJBZNCR","wmos":[]},
				{"ref":"WUV7B3M","wmos":[]},
				{"ref":"MMVY6VS","wmos":[
					{"endDate":null,"startDate":"2014-10-14T00:00:00","wmo":"CFO383"}
					]
				}
			],"total":3}
		</pre>
		</div>
	</li>
	<li>
		All elements matching '2900' in the beginning of their reference, including the reference and the country name in the output:
		<div class="text-center" data-toggle="collapse" data-target="#frequentQuery4" role="button">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform?exp=["ref like '2900%'"]&include=["ref","program.country.name"]</span>
		</div>
		<div id="frequentQuery4" class="collapse">
		<pre>
			{"data":[
			{"program":{"country":{"name":"Japan"}},"ref":"2900000"},
			{"program":{"country":{"name":"Japan"}},"ref":"2900001"},
			{"program":{"country":{"name":"Japan"}},"ref":"2900002"},
			...
			],"total":922}
		</pre>
		</div>
	</li>
	<li>
		All elements deployed after February 1st, 2021 and having a status 'OPERATIONAL' or 'REGISTERED', fetching the reference only:
		<div class="text-center" data-toggle="collapse" data-target="#frequentQuery5" role="button">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/?exp=["ptfStatus.name in ('REGISTERED','OPERATIONAL') and ptfDepl.deplDate>$d","2021-02-01 00:00:00"]&include=["ref"]</span>
		</div>
		<div id="frequentQuery5" class="collapse">
		<pre>
			{"data":[
				{"ref":"6904093"},{"ref":"1901927"},{"ref":"6801598_001"},{"ref":"6904132"},{"ref":"6904122"},
				...
			], "total":52}
		</pre>
		</div>
	</li>
</ul>
<br>
<br>

<h3>XML format</h3>
<div class="well">
	URL endpoint: <code>/<%=entityPath%>/platform/wmdr/</code>
</div>
<p>
	This service provides a XML WMDR-compliant output on a per platform based request.
</p>
<br>
<h4 id="get-platform-details">Getting the details of a referenced platform</h4>
<p>
	The list of platform could be reduced to one record, making it a direct access to a single entity.
	There is however shortcut URLs to access platform's details.
	Platform's details can be obtained with a GET request using the following dedicated URL pattern:
	<div class="text-center">
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/[ID]</span><br>
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/ref/[REF]</span><br>
		<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/wigosid/[WIGOS ID]</span><br>
	</div>
	<br>
	Where (replace the squared brackets as well "[]"): 
	<ul>
		<li>"[ID]" is the database identifier of the platform;</li>
		<li>"[REF]" is the OceanOPS' reference of the platform;</li>
		<li>"[WIGOS ID]" is the WIGOS identifier of the platform.</li>
	</ul>
</p>

<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#detailsPtfWMDRExample" aria-expanded="false"	aria-controls="detailsPtfWMDRExample">Example</button>
<div id="detailsPtfWMDRExample" class="collapse">
	<div class="well">
		To generate the details information of platform (id=512263) in json	format. Here the dedicated URLs for this example:
		<div class="text-center">
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/512263</span><br>
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/ref/6902545</span><br>
			<span class="url"><%=rootUrl%><%=entityPath%>/platform/wmdr/wigosid/0-22000-0-6902545</span><br>
		</div>
	</div>
</div>