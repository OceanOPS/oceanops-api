<p>
As the number of information systems is growing as well as networks metadata specifications are specified, it is important to clearly define the vocabulary being used within the JCOMMOPS' scope.
JCOMMOPS tries to harmonize and integrate different vocabularies and ontologies. Hence, you might not be familiar with all the terms used and how they are used by this API, so please read carefully this section. 
</p>
<div class="table-responsive">
	<table class="table">
		<thead>
			<tr>
				<th>Entity</th>
				<th>Description</th>
				<th>Known aliases</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Platform</td>
				<td>
				All that can be deployed and can measure parameters is considered as a "Platform" at JCOMMOPS:
				<ul>
					<li>Argo: float;</li>
					<li>DBCP: drifting buoy, moored buoy, fixed platform, tsunameter;</li>
					<li>SOT: VOS weather station, ASAP balloon, XBT profiler;</li>
					<li>OceanSITES: mooring line;</li>
					<li>GO-SHIP: not applicable;</li>
					<li>GLOSS: tide gauge.</li>
				</ul>
				</td>
				<td>Station</td>
			</tr>
			<tr>
				<td>Platform status</td>
				<td>
					JCOMMOPS defines several statuses, which are used to track a platform during its lifecycle. They are automatically set depending on the metadata we received in real time (i.e. GTS/GDAC).
					<ul>
						<li><strong>Probable</strong>: starting status for some platforms, when there is only a few metadata available, like rough deployment location and date. The platform may be deployed;</li>
						<li><strong>Confirmed</strong>: automatically set when a ship is attached to the deployment information. The platform is ready to be deployed, deployment is planned;</li>
						<li><strong>Registered</strong>: starting status for most of the networks, when deployment planning is not done. The deployment is certain, and a notification has been sent via the JCOMMOPS system;</li>
						<li><strong>Active</strong>: automatically set when the platform is emitting a pulse within a certain time interval (a location is received, independently from the observation);</li>
						<li><strong>Operational</strong>: automatically set when the platform is emitting a pulse and observations are distributed within a certain time interval;</li>
						<li><strong>Inactive</strong>: the platform is not emitting a pulse since a certain time;</li>
						<li><strong>Closed</strong>: the platform is not emitting a pulse since a long time, it is considered as dead.</li>
					</ul>
				</td>
				<td>-</td>
			</tr>
			<tr>
				<td>Platform model</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Platform type</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Platform family</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Program</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Country</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Master program</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Network</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Variable</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Sensor model</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
			<tr>
				<td>Sensor type</td>
				<td>$$TBD</td>
				<td></td>
			</tr>
		</tbody>
	</table>
</div>