<h3>General information</h3>
<p>
	OceanOPS Web Service API is a REST API designed to distribute metadata, in interoperable and ready-to-use formats, 
	to integrate other software (usually under machine to machine schema). 
	The metadata distributed by this API version (V<%=version%>) are in two common data formats: <b>.json</b> and <b>.xml (WMDR compliant)</b>.
</p>
<h3>Terms of use</h3>
<p>This API is primarily dedicated to the GOOS community and further to research and operational, oceanographic and meteorological communities, not to the large public.</p>
<p>All rights reserved.</p>
<p>
	The information provided through this API may be freely used and copied for educational and other non-commercial purposes, provided that any reproduction of data (e.g. metadata, reference tables, etc.) be accompanied by an acknowledgement (credit, link) of OceanOPS as the source.
	Any other use of the information requires permission from OceanOPS and requests should be directed to: support@ocean-ops.org.
</p>
<p>
	The depiction and use of boundaries, geographic names and related data shown on maps and included in lists, tables, documents and databases on this website are not warranted to be error free nor do they imply official endorsement or acceptance by the Intergovernmental Oceanographic Commission of UNESCO and the World Meteorological Organization.
</p>
<h3>Versionning</h3>
<p>
	The versionning pattern of this API is as follows: <code>Major.Minor</code>.
	<ul>
		<li><code>Major</code> refers to a major version update. This typically refers to an update in the behavior of the API. This is highly subject to <strong>breaking changes</strong> and is then reflected in the URL.</li>
		<li><code>Minor</code> refers to a minor version update. This concerns mainly addition of entities, metadata, new formats. 
	</ul> 
	Minor changes - such as bug fixes, typos, etc. (everything subject to a hot patch) - is not subject to any breaking change and does not increment the version.</li>
</p>

<p>
	The latest version of the API can be reached at that URL (the link will redirect to the numbered version of the URL): 
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%></span></div>
	<br>
	On top of the latest version, two previous versions (major or minor) will be kept for backward compatibility.
	<br><br>
	Should you wish to follow our latest improvements, check out our latest preview version by going there:
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%>preview/</span></div>
</p>
<h3>Release notes</h3>
<p>Release notes can be consulted <a href="https://trello.com/c/eI7YS3wp" target="_blank">here</a>.</p>
<h3>Development progress</h3>
<p>A public <a href="https://trello.com" target="_blank">Trello</a> board is available <a href="https://trello.com/b/d5BstHHd" target="_blank">here</a> to follow our progress in improving this API.</p>
<p>The source code of this project is available in the following GitHub repository <a href="https://github.com/OceanOPS/oceanops-api/" target="_blank">https://github.com/OceanOPS/oceanops-api/</a>.</p>
<p>This work is licensed under <a target="_blank" rel="license" href="http://www.apache.org/licenses/LICENSE-2.0">Apache License 2.0</a>.</p>