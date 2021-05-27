<p>One can access the reference tables being used at OceanOPS in a JSON format.</p>
<h3>Commons & integrated view</h3>
<form name="submitConcepts" method="POST">
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr>
					<th>Concept</th>
					<th>View</th>
					<th>JSON link</th>
				</tr>
			</thead>
			<tbody>
                <%
                    for (int i = 0; i <concepts.size(); i++){
                        HashMap<String, String> c = concepts.get(i);
                %>
				<tr>
					<td><%= c.get("name") %></td>
                    <td><a class="btn btn-default btn-block" target="_blank" href='?param=<%= c.get("urlParam") %>' role="button"><%= c.get("name") %></a></td>
                    <td><%=rootUrl%><%=entityPath%>/<%= c.get("jsonUrl") %></td>
                </tr>
                <%
                    }
                %>
			</tbody>
		</table>
	</div>
</form>