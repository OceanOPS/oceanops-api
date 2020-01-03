<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
		String rootUrl = (String) request.getAttribute("rootUrl");
		String rootUrlNoVersion = (String) request.getAttribute("rootUrlNoVersion");
		String version = (String) request.getAttribute("projectVersion");
		String name = (String) request.getAttribute("projectName");
		String helpEditionDate = (String) request.getAttribute("helpEditionDate");
		boolean isBetaVersion = (boolean) request.getAttribute("betaVersion");
		String versionQualifier = (String) request.getAttribute("versionQualifier");
	%>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<title><%=name%> help</title>
   	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
   	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"	crossorigin="anonymous">
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://cdn.rawgit.com/afeld/bootstrap-toc/v0.4.1/dist/bootstrap-toc.min.css">
	<script src="https://cdn.rawgit.com/afeld/bootstrap-toc/v0.4.1/dist/bootstrap-toc.min.js"></script>
	
	<link rel="stylesheet" href="../styles/main.css">
	<link rel="stylesheet" href="../styles/toc.css">
	<script src="../scripts/main.js"></script>
</head>	
<body data-spy="scroll" data-target="#toc">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<h1><img src="//www.jcommops.org/static/images/jcommops/logos/jcommops-sm.png" alt="JCOMMOPS logo"/> API <small>documentation<%if(isBetaVersion){ %> <span class="label label-warning"><%=versionQualifier%></span><%}%></small></h1>
			</div>
			<p class="navbar-text navbar-right text-right">applicable version: <%=version%><br>last edited: <%=helpEditionDate%></p>
		</div>
	</nav>
	<div id="main-container" class="container-fluid">
		<div class="row">
			<div class="col-sm-2" id="left-side-container">
				<nav id="toc" data-spy="affix"></nav>
			</div>
			<div class="col-sm-10">
				<%if(isBetaVersion){ %>
				<div class="well">			
					<p class="text-warning">This version is tagged "<%=versionQualifier%>". The specifications listed below and the results provided by this API are highly susceptible to change. Feedbacks are welcomed.</p>
				</div>
				<%}%>
								
				<h2 class="title-border-bottom">About the API</h2>
				<div class="container-fluid">
					<%@include file="help/about.jsp" %>
				</div>		
				<h2 class="title-border-bottom">v<%=version%> details</h2>
				<div class="container-fluid">
					<%@include file="help/versionSpecifics.jsp" %>
				</div>
				<h2 class="title-border-bottom">Concepts</h2>
				<div class="container-fluid">
					<%@include file="help/concepts.jsp" %>
				</div>
				<h2 class="title-border-bottom">Vocabularies</h2>
				<div class="container-fluid">
					<!-- <%@include file="help/referenceTables.jsp" %>  -->
					To be done.
				</div>
				<h2 class="title-border-bottom">Platforms</h2>				
				<div class="container-fluid">
					<%@include file="help/platforms.jsp" %>
				</div>
				
				<h2 class="title-border-bottom">Cruises</h2>
				<div class="container-fluid">
					To be done.
				</div>
			</div>
		</div>
	</div>
</body>
</html>