<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
		String uri = (String) request.getAttribute("uri");
		String version = (String) request.getAttribute("projectVersion");
		String name = (String) request.getAttribute("projectName");
		
		String parameter= (String) request.getAttribute("parameter");
		String parameter_name= (String) request.getAttribute("parameter_name");
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
	<link rel="stylesheet" href="../styles/loader-vertical-bars.css">	
	<script>
		$(document).ready(function(){
			var parameter_uri="<%=parameter%>";
						
			$.ajax({
				url: parameter_uri,
				dataType: 'json',
				type: 'get',
				cache: false,
				success: function(data) {
					var table = $("#parameterTableBody");
					content = "";
					$(data.data).each(function(index, value){
						content += "<tr>"+"<td>"+value.code2+"</td>"+"<td>"+value.nameShort+"</td>"+"<td>"+value.name+"</td>"+"</tr>";	
					}); 	
					table.html(content);
					$("#loader").hide();
				}
			});
		});		
	</script>
</head>
<body>	
	<div id="loader" class="cssload-container fullscreen-loader">
		<ul class="cssload-flex-container">
			<li>
				<span class="cssload-loading"></span>
			</li>
		</ul>
	</div>
	<div class="container">
		<div class="page-header">
			<h1><%=parameter_name%></h1>
		</div>
		<div class="well">
			<div class="table-responsive">
				<table class="table" id="table">
					<thead>
						<tr>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<th>ISO Code (2)*</th>
							<th>Name</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody id="parameterTableBody">
					</tbody>
				</table>
			</div>
		</div>
		<p>(*) Parameters used in the search URL</p>
	</div>
</body>
</html>