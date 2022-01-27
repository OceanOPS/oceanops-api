<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
		String rootUrl = (String) request.getAttribute("rootUrl");
		String rootUrlNoVersion = (String) request.getAttribute("rootUrlNoVersion");
		String version = (String) request.getAttribute("projectVersion");
		String name = (String) request.getAttribute("projectName");
		String entityPath = (String) request.getAttribute("entityPath");
		String helpEditionDate = (String) request.getAttribute("helpEditionDate");
		boolean isBetaVersion = (boolean) request.getAttribute("betaVersion");
		String versionQualifier = (String) request.getAttribute("versionQualifier");
		ArrayList<HashMap<String, String>> concepts = (ArrayList<HashMap<String, String>>) request.getAttribute("concepts");
	%>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<title><%=name%> help</title>
   	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
   	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	
	<link
	  rel="stylesheet"
	  href="https://cdn.rawgit.com/afeld/bootstrap-toc/v1.0.1/dist/bootstrap-toc.min.css"
	/>
	<script src="https://cdn.rawgit.com/afeld/bootstrap-toc/v1.0.1/dist/bootstrap-toc.min.js"></script>
	
	<style><%@include file="/styles/main.css"%></style>
	<style><%@include file="/styles/toc.css"%></style>
	<script><%@include file="/scripts/main.js"%></script>
</head>	
<body>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<div class="navbar-header">
				<h1><img src="//www.ocean-ops.org/static/images/oceanops/logos/oceanops-sm.png" alt="OceanOPS logo"/> API <small>documentation<%if(isBetaVersion){ %> <span class="badge bg-warning"><%=versionQualifier%></span><%}%></small></h1>
			</div>
			<p class="navbar-text navbar-right text-right">last version: <%=version%><br>last published: <%=helpEditionDate%><br><a href='https://<%=rootUrl%>oceanops-api.yaml' target='_blank'>OpenAPI definition</a> - <a href='https://<%=rootUrlNoVersion%>swagger/?url=https://<%=rootUrl%>oceanops-api.yaml' target='_blank'>Swagger UI</a></p>
		</div>
	</nav>
	<div id="main-container" class="container-fluid">
		<div class="row">
			<div class="col-xl-2" id="left-side-container">
				<nav id="toc" data-spy="affix" class="sticky-top"></nav>
			</div>
			<div class="col-xl-10">
				<%if(isBetaVersion){ %>
				<div class="alert alert-warning">			
					This version is tagged "<%=versionQualifier%>". The specifications listed below and the results provided by this API are highly susceptible to change. Feedbacks are welcomed.
				</div>
				<%}%>
								
				<h2 class="title-border-bottom">About the API</h2>
				<div class="container-fluid">
					<%@include file="help/about.jsp" %>
				</div>		
				<h2 class="title-border-bottom">Version details</h2>
				<div class="container-fluid">
					<%@include file="help/versionSpecifics.jsp" %>
				</div>
				<h2 class="title-border-bottom">Concepts & API organisation</h2>
				<div class="container-fluid">
					<%@include file="help/concepts.jsp" %>
				</div>
				<h2 class="title-border-bottom">Vocabularies</h2>
				<div class="container-fluid">
					<%@include file="help/referenceTables.jsp" %>
				</div>
				<h2 class="title-border-bottom">Entities Access</h2>				
				<div class="container-fluid">
					<%@include file="help/entitiesAccess.jsp" %>
				</div>
			</div>
		</div>
	</div>
	<br>
</body>
</html>