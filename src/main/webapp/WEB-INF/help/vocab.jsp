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
				<td>Station&nbsp;(VOS)</td>
			</tr>
			<tr>
				<td>Ship</td>
				<td>
					A ship is the vehicle that carries a platform (the shipment) either upon its deployment (e.g. deployment of a drifting buoy) or during a certain operation time (e.g. a VOS station). 
					It is usually a boat (Research Vessel, merchant ship, etc.) but can also take another form like an airplane.
				</td>
				<td>Platform&nbsp;(ICES)</td>
			</tr>
			<tr>
				<td>Master program</td>
				<td>
					A master program is a core network that contribute to JCOMM, and then act as pillars to JCOMMOPS. It is a key entity in all JCOMMOPS products and usually defines the main categorization that can be encoutered.
					Currently, there are 6 of them: Argo, DBCP, SOT, OceanSITES, GO-SHIP and GLOSS.
				</td>
				<td>Network</td>
			</tr>
			<tr>
				<td>Platform status</td>
				<td>
					JCOMMOPS defines several statuses, which are used to track a platform during its lifecycle. They are automatically set depending on the metadata we received at the registration (deployment plans) and in real time (through observations, i.e. GTS/GDAC).
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
				<td>Platform family</td>
				<td>The highest level of categorization of a platform. Describes to what category instrument this platform belongs to.<br>Examples: drifting buoy, moored buoy, fixed station, ship weather station, etc..</td>
				<td>-</td>
			</tr>
			<tr>
				<td>Platform type</td>
				<td>The middle level of categorization of a platform. It makes the link between the platform's category (family) and the manufacturer's model.<br>Example: DART (model)&nbsp;&lt;&nbsp;Tsunameter buoy (type)&nbsp;&lt;&nbsp;Moored buoy (family). </td>
				<td>-</td>
			</tr>
			<tr>
				<td>Platform model</td>
				<td>The most detailed level of categorization of a platform, ideally containing manufacturer's information.<br>Examples: ARVOR (NKE Instrumentation), SVP (Data Buoy Instrumentation, LLC), etc..</td>
				<td>-</td>
			</tr>
			<tr>
				<td>Agency</td>
				<td>An agency is an organization, a manufacturer, a data center, etc..<br>Examples: BSH, Ifremer, NOAA/PMEL, etc..</td>
				<td>Organization</td>
			</tr>
			<tr>
				<td>Program</td>
				<td>
					A program defines a group of platforms or cruises managed by the same operator. A program is bound to one country and to one agency. 
					It is usually a national/agency-implementation of the master programme.
					<br>Examples: Argo ITALY, E-SURFMAR DB, VOS-CA, etc..</td>
				<td>-</td>
			</tr>
			<tr>
				<td>Country</td>
				<td>The country list used by JCOMMOPS is a union of the member state lists of the IOC-UNESCO and the WMO. <a href="https://fr.wikipedia.org/wiki/ISO_3166-1" target="_blank">ISO 3166-1</a> is used to identify them.</td>
				<td>Member State (IOC-UNESCO, WMO)</td>
			</tr>
			<tr>
				<td>Network</td>
				<td>
					A network is a regroupment of platforms, more precise than the master program but crosses the boundaries of the program. It is usually virtual and represents a common effort or way to measure data.<br>
					Examples: E-SURFMAR, GDP, BGC-Argo, VOS, etc..
				</td>
				<td>-</td>
			</tr>
			<tr>
				<td>Variable</td>
				<td>Variables describe what is measured by a sensor on a platform. This entity contains simplified variables, to ease the later uses.$$examples</td>
				<td>Parameter</td>
			</tr>
			<tr>
				<td>Variable detailled/Sub variable</td>
				<td>Sub-variables are detailled variable, used as needed and coming from reference datasets like CF.$$examples</td>
				<td>Parameter</td>
			</tr>
			<tr>
				<td>Variable Family</td>
				<td>Variable families are a regroupment of variables, aiming to simplify and represent what is measured in an easy way.$$examples</td>
				<td>EOV/ECV</td>
			</tr>
			<tr>
				<td>Sensor model</td>
				<td>
					This entity represents a package of sensor types (sensors, gauges, probes, etc.). It is usually provided by a manufacturer alongside a serial number.
					<br>Examples: SBE41 (NKE Instrumentation), HMP110 (VAISALA), Honeywell HPB (Honeywell), etc..
				</td>
				<td>Instrument</td>
			</tr>
			<tr>
				<td>Sensor type</td>
				<td>
					A sensor type is a high categorization of sensor, performing one measurement.
					<br>Examples: Barometer aneroid, SST radiation thermometer, Fluorometer Chla, etc.
				</td>
				<td>Sensor</td>
			</tr>
		</tbody>
	</table>
</div>