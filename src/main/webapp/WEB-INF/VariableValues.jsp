			<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>




<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta charset="UTF-8">

<!-- If IE use the latest rendering engine -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Set the page to the width of the device and set the zoon level -->
<meta name="viewport" content="width = device-width, initial-scale = 1">
<title>JCOMMOPS RESTful Web Application</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">



<style>
.jumbotron {
	background-color: #f2f5f7;
	padding-bottom: 10px;
	background-size: cover;
	padding-top: 1px;
	color: black;
	font-size: 14;
}
/* Adds borders for tabs */
.tab-content {
	border-left: 1px solid #ddd;
	border-right: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
	padding: 10px;
}

.nav-tabs {
	margin-bottom: 0;
}
</style>

</head>
<body>

	<!-- CONTAINERS -->
	<div class="container">

		<div class="page-header">
			<center>
				<h3>Variables</h3>

			</center>

		</div>
		<div class=jumbotron>
			<div class="row">
				<div class="col-lg-12 col-md-2 col-sm-4 col-xs-12">

					<div class="table-responsive">
						<table class="table" id="table">
							<thead>
								<tr>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<th>ID*</th>
									<th>Short Name*</th>
									<th>Name</th>
									<th>Description</th>
								</tr>
							</thead>

							<tbody>

							</tbody>



						</table>
					</div>



				</div>
				<p style="font-size: 80%;">(*) Parameters used in the search URL</p>
			</div>
		</div>

		<script>
			$
					.ajax({
						url : 'http://localhost:8081/jcommops-api/api/rest/1.0/variables.json',
						type : 'GET',
				        dataType : 'json',
						cache : false,
						success : function(data) {
					/* 		var tableRef = document.getElementById('table').getElementsByTagName('tbody')[0];
							var c = document.body.children;
							console.log(c); */
							var row;
						row=$("");
							$(data).each(
									function(index, value) {
										
										$('table tr:last').after("<tr>" + "<td>"
												+ value.id + "</td>" + "<td>"
												+ value.nameShort + "</td>"
												+ "<td>" + value.name + "</td>"
												+ "<td>" + value.description
												+ "</td>" + "</tr>");
															});		
						}
					});
		</script>

	</div>
</body>
</html>