<h3>General information</h3>
<p>
	JCOMMOPS Web Service API is a REST API designed to distribute metadata, in interoperable and ready-to-use formats, 
	to integrate other software (usually under machine to machine schema). 
	The metadata distributed by this API version (V<%=version%>) are in three common data formats: <b>.json</b>, <b>.xml (WMDR compliant)</b> and <b>.csv</b>.
</p>
<h3>Terms of use</h3>
<p>This API is primarily dedicated to the JCOMM/GOOS community and further to research and operational, oceanographic and meteorological communities, not to the large public.</p>
<p>All rights reserved.</p>
<p>
	The information provided through this API may be freely used and copied for educational and other non-commercial purposes, provided that any reproduction of data (e.g. metadata, reference tables, etc.) be accompanied by an acknowledgement (credit, link) of JCOMMOPS as the source.
	Any other use of the information requires permission from JCOMMOPS and requests should be directed to: support@jcommops.org.
</p>
<p>
	The depiction and use of boundaries, geographic names and related data shown on maps and included in lists, tables, documents and databases on this website are not warranted to be error free nor do they imply official endorsement or acceptance by the Intergovernmental Oceanographic Commission of UNESCO and the World Meteorological Organization.
</p>
<h3>Versionning</h3>
<p>
	The versionning pattern of this API is as follows: <code>X.Y.Z</code>.
	<ul>
		<li><code>X</code> refers to a major version update. This typically refers to an update in the behavior of the API. This is highly subject to <strong>breaking changes</strong>.</li>
		<li><code>Y</code> refers to a sub-major version update. This concerns mainly addition of entities, metadata, new formats. 
		This might involve <strong>breaking changes</strong>, depending on what format the client is using and how flexible it is.</li>
		<li><code>Z</code> refers to minor changes, such as bug fixes, typos, etc.. This is not subject to any breaking change.</li>
	</ul> 
</p>

<p>
	The latest version of the API can be reached at that URL (the link will redirect to the numbered version of the URL): 
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%>latest/</span></div>
	<br>
	On top of the latest version, two previous versions (major or sub-major) will be kept for backward compatibility.
	<br><br>
	Should you wish to follow our latest improvements, check out our latest preview version by going there:
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%>preview/</span></div>
</p>
<h3>Release notes</h3>
<p>Release notes can be consulted <a href="https://trello.com/c/eI7YS3wp" target="_blank">here</a>.</p>
<h3>Development progress</h3>
<p>A public <a href="https://trello.com" target="_blank">Trello</a> board is available <a href="https://trello.com/b/d5BstHHd" target="_blank">here</a> to follow our progress in improving this API.</p>
<p>The source code of this project is available in the following GitHub repository <a href="https://github.com/JCOMMOPS/jcommops-api/" target="_blank">https://github.com/JCOMMOPS/jcommops-api/</a> ($$TBD license).</p>