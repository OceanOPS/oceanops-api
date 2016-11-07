<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	background-color: #6096f2;
	color: white;
	font-size: 12;
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
	<!-- container puts padding around itself while container-fluid fills the whole screen. Bootstap grids require a container. -->
	<div class="container">

		<!-- page-header adds space aroundtext and enlarges it. It also adds an underline at the end -->
		<div class="page-header">
			<center>
				<h1>Documentation: JCOMMOPS RESTful Web Application</h1>
			</center>

		<div class=jumbotron>
			<div class="row">
				<div class="col-lg-12 col-md-2 col-sm-4 col-xs-12">
					<h2>
						<a href="#AboutTheAPI" data-toggle="collapse">About the API</a>
					</h2>
					<div id="AboutTheAPI" class="collapse">JCOMMOPS Web Service
						API is a REST-like API designed to distribute metadata, in
						interoperable and ready-to-use formats, to integrate other
						software (usually under machine to machine schema).</div>
				</div>
			</div>
		</div>
		<div class=jumbotron>
			<div class="row">
				<div class="col-lg-12 col-md-2 col-sm-4 col-xs-12">
					<h2>
						<a href="#ListingThePlatforms" data-toggle="collapse">
							1.Listing the platforms</a>
					</h2>
					<div id="ListingThePlatforms" class="collapse">
						The list of platforms includes platforms’ “ids” and their
						corresponding “JCOMMOPS-References” <br>
						<div class=jumbotron>
							<div class="row">
								<div class="col-lg-12 col-md-2 col-sm-4 col-xs-12">
									<h3>
										<a href="#ListingAllThePlatforms" data-toggle="collapse">1.1.
											Listing all the platforms</a>
									</h3>
									<div id="ListingAllThePlatforms" class="collapse">
										The total list of all the inventoried platforms can be
										obtained with a GET request using this URL pattern:<br>
										Global platforms list URL-pattern:<br> [ROOT ][/]
										api[/]rest[/]X.Y[/] platforms.format<br> Where “X.Y”
										string path is the version of the API (current version is 1.0)
										and “format” in “platforms.format” string path represents the
										data output . Current supported formats: . json and .xml<br>
										Global list URL example: To generate the global platforms list
										in Json format, here the dedicated URL:<br> “
										[ROOT]/api/rest/1.0/platforms.json “
									</div>
								</div>
							</div>
						</div>
						<div class=jumbotron>
							<div class="row">
								<div class="col-lg-12 col-md-2 col-sm-4 col-xs-12">
									<h3>
										<a href="#ListingFilteredPlatforms" data-toggle="collapse">1.2.
											Listing a selected list of the platforms using key parameters</a>
									</h3>
									<div id="ListingFilteredPlatforms" class="collapse">A
										select list of platforms can be obtained with a GET request
										using this URL pattern:<br> Selected platforms list URL-pattern:<br>
										[ROOT][/] api[/]rest[/]X.Y[/] platforms.format[/]
										find?parm1=value1&parm2=value2<br> Where parm1, parm2…param(i)
										respresent the query parameter and value1, value2…value(i)
										represent the corresponding values respectively. <br>Table 1.
										Search parameters to specify the URL of a “selected list of
										platforms”.</div>
								</div>
							</div>
						</div>

					</div>

				</div>
			</div>
		</div>

		<br>
	</div>
































	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>