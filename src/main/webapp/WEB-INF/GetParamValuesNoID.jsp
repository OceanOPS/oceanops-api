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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function(){
			var parameter_uri="<%=parameter%>";
			var root_uri="<%=uri%>";
			
			$.ajax({
				url: root_uri + parameter_uri,
				dataType: 'json',
				type: 'get',
				cache: false,
				success: function(data) {
					var table = $("#parameterTableBody");
					content = "";
					$(data).each(function(index, value){
						content += "<tr>"+"<td>"+value.nameShort+"</td>"+"<td>"+value.name+"</td>"+"<td>"+value.description+"</td>"+"</tr>";	
					}); 	
					table.html(content);
					$("#loader").hide();
				}
			});
		});		
	</script>
	<style>
		.cssload-container * {
			box-sizing: border-box;
				-o-box-sizing: border-box;
				-ms-box-sizing: border-box;
				-webkit-box-sizing: border-box;
				-moz-box-sizing: border-box;
		}
		.cssload-container {
			margin: 19px auto 0 auto;
			max-width: 545px;
		}
		
		.cssload-container ul li{
			list-style: none;
		}
		
		.cssload-flex-container {
			display: flex;
				display: -o-flex;
				display: -ms-flex;
				display: -webkit-flex;
				display: -moz-flex;
			flex-direction: row;
				-o-flex-direction: row;
				-ms-flex-direction: row;
				-webkit-flex-direction: row;
				-moz-flex-direction: row;
			flex-wrap: wrap;
				-o-flex-wrap: wrap;
				-ms-flex-wrap: wrap;
				-webkit-flex-wrap: wrap;
				-moz-flex-wrap: wrap;
			justify-content: space-around;
		}
		.cssload-flex-container li {
			padding: 10px;
			height: 97px;
			width: 97px;
			margin: 29px 19px;
			position: relative;
			text-align: center;
		}
		
		.cssload-loading, .cssload-loading:after, .cssload-loading:before {
			display: inline-block;
			position: relative;
			width: 5px;
			height: 49px;
			background: rgb(0,0,0);
			margin-top: 5px;
			border-radius: 975px;
				-o-border-radius: 975px;
				-ms-border-radius: 975px;
				-webkit-border-radius: 975px;
				-moz-border-radius: 975px;
			animation: cssload-upDown2 1.15s ease infinite;
				-o-animation: cssload-upDown2 1.15s ease infinite;
				-ms-animation: cssload-upDown2 1.15s ease infinite;
				-webkit-animation: cssload-upDown2 1.15s ease infinite;
				-moz-animation: cssload-upDown2 1.15s ease infinite;
			animation-direction: alternate;
				-o-animation-direction: alternate;
				-ms-animation-direction: alternate;
				-webkit-animation-direction: alternate;
				-moz-animation-direction: alternate;
			animation-delay: 0.29s;
				-o-animation-delay: 0.29s;
				-ms-animation-delay: 0.29s;
				-webkit-animation-delay: 0.29s;
				-moz-animation-delay: 0.29s;
		}
		.cssload-loading:after, .cssload-loading:before {
			position: absolute;
			content: '';
			animation: cssload-upDown 1.15s ease infinite;
				-o-animation: cssload-upDown 1.15s ease infinite;
				-ms-animation: cssload-upDown 1.15s ease infinite;
				-webkit-animation: cssload-upDown 1.15s ease infinite;
				-moz-animation: cssload-upDown 1.15s ease infinite;
			animation-direction: alternate;
				-o-animation-direction: alternate;
				-ms-animation-direction: alternate;
				-webkit-animation-direction: alternate;
				-moz-animation-direction: alternate;
		}
		.cssload-loading:before {
			left: -10px;
		}
		.cssload-loading:after {
			left: 10px;
			animation-delay: 0.58s;
				-o-animation-delay: 0.58s;
				-ms-animation-delay: 0.58s;
				-webkit-animation-delay: 0.58s;
				-moz-animation-delay: 0.58s;
		}
		
		
		
		
		@keyframes cssload-upDown {
			from {
				transform: translateY(19px);
			}
			to {
				transform: translateY(-19px);
			}
		}
		
		@-o-keyframes cssload-upDown {
			from {
				-o-transform: translateY(19px);
			}
			to {
				-o-transform: translateY(-19px);
			}
		}
		
		@-ms-keyframes cssload-upDown {
			from {
				-ms-transform: translateY(19px);
			}
			to {
				-ms-transform: translateY(-19px);
			}
		}
		
		@-webkit-keyframes cssload-upDown {
			from {
				-webkit-transform: translateY(19px);
			}
			to {
				-webkit-transform: translateY(-19px);
			}
		}
		
		@-moz-keyframes cssload-upDown {
			from {
				-moz-transform: translateY(19px);
			}
			to {
				-moz-transform: translateY(-19px);
			}
		}
		
		@keyframes cssload-upDown2 {
			from {
				transform: translateY(29px);
			}
			to {
				transform: translateY(-19px);
			}
		}
		
		@-o-keyframes cssload-upDown2 {
			from {
				-o-transform: translateY(29px);
			}
			to {
				-o-transform: translateY(-19px);
			}
		}
		
		@-ms-keyframes cssload-upDown2 {
			from {
				-ms-transform: translateY(29px);
			}
			to {
				-ms-transform: translateY(-19px);
			}
		}
		
		@-webkit-keyframes cssload-upDown2 {
			from {
				-webkit-transform: translateY(29px);
			}
			to {
				-webkit-transform: translateY(-19px);
			}
		}
		
		@-moz-keyframes cssload-upDown2 {
			from {
				-moz-transform: translateY(29px);
			}
			to {
				-moz-transform: translateY(-19px);
			}
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1><%=parameter_name%></h1>
		</div>
		<div class="well">
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
									<th>Short Name*</th>
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
				
				<div id="loader" class="cssload-container">
					<ul class="cssload-flex-container">
						<li>
							<span class="cssload-loading"></span>
						</li>
					</div>
				</div>	
			</div>
		</div>
</div>

</body>
</html>