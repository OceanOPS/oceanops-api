<h3>General information</h3>
<p>
	JCOMMOPS Web Service API is a REST API designed to distribute metadata, in interoperable and ready-to-use formats, 
	to integrate other software (usually under machine to machine schema). 
	The metadata distributed by this API version (V<%=version%>) are in three common data formats: <b>.json</b> and <b>.csv</b>.
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
	The latest version of the API can be reached at that URL (the link will redirect to the numbered version of the API): 
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%>latest/</span></div>
	<br>
	On top of the latest version, two previous versions (major or sub-major) will be kept for backward compatibility.
	<br><br>
	Should you wish to follow our latest improvements, check out our latest beta version by going there:
	<div class="text-center"><span class="url"><%=rootUrlNoVersion%>beta/</span></div>
</p>
<h3>Release notes</h3>
<p>Release notes can be consulted <a href="https://trello.com/c/eI7YS3wp" target="_blank">here</a>.</p>
<h3>Development progress</h3>
<p>A public  <a href="https://trello.com" target="_blank">Trello</a> board is available <a href="https://trello.com/b/d5BstHHd" target="_blank">here</a> to follow our progress in improving this API.</p>