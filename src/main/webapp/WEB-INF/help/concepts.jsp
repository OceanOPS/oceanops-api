<h3>Concepts in OceanOPS (meta)data system</h3>
<p>All the underlying concepts used and offered by this service are described there: 
    <div class="text-center"><span class="url"><a href='https://ocean-ops.org/metadata' target='_blank'>ocean-ops.org/metadata</a></span></div>
</p>

<h3>Organisation of concepts in the API</h3> 
<p>This API uses the framework <a href="https://agrest/io" target="_blank">AgRest</a> to serve the content in JSON format. 
This framework offers a powerful and simple mean to query, filter and format results based on what is needed on the client side.
The best way to learn how to query our API then is to read the <a href="https://agrest.io/protocol/" target="_blank">"Protocol" part of AgRest's documentation</a>.
However, this page will guide you through the basics of it through examples below.</p>

<p>
    By default, accessing an AgRest concept will display all its leaf nodes (scalar attributes) but none of the relationship. 
    This can give you an overview and a list of what to pick in the 'include' parameter (see further in this documentation).
    This parameter can be used to restrict the attributes in the output, and also to include related concepts through relationships.
    The different attributes and relationships available are documented in the <a href="https://www.openapis.org/" target='_blank'>OpenAPI</a> 3.0 definition available here:
    <div class="text-center"><span class="url"><a href='https://<%=rootUrl%>oceanops-api.yaml' target='_blank'><%=rootUrl%>oceanops-api.yaml</a></span></div>
    It can be displayed in a more human readable version, through the <a href='https://swagger.io' target='_blank'>Swagger</a> UI application here:     
    <div class="text-center"><span class="url"><a href='https://<%=rootUrlNoVersion%>swagger/?url=https://<%=rootUrl%>oceanops-api.yaml' target='_blank'><%=rootUrlNoVersion%>swagger</a></span></div>
</p>

<p>Please note that the <emph>Platform</emph> concept is also available through a XML WIGOS compliant format.</p>