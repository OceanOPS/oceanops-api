package org.oceanops.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class
 */
public class Help extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<HashMap<String, String>> concepts = new ArrayList<HashMap<String, String>>();

	public Help() {
		super();
		HashMap<String, String> concept = new HashMap<String, String>();
		concept.put("name", "Platform status");
		concept.put("urlParam", "platformstatus");
		concept.put("jsonUrl", "platformstatus");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform model");
		concept.put("urlParam", "platformmodel?include=[\"id\",\"name\",\"nameShort\",\"weblink.url\"]");
		concept.put("jsonUrl", "platformmodel?include=[\"id\",\"name\",\"nameShort\",\"weblink.url\"]");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform type");
		concept.put("urlParam", "platformtype");
		concept.put("jsonUrl", "platformtype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform family");
		concept.put("urlParam", "platformfamily");
		concept.put("jsonUrl", "platformfamily");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Programme");
		concept.put("urlParam", "program");
		concept.put("jsonUrl", "program");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Country");
		concept.put("urlParam", "country");
		concept.put("jsonUrl", "country");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Network");
		concept.put("urlParam", "network");
		concept.put("jsonUrl", "network");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Network type");
		concept.put("urlParam", "networktype");
		concept.put("jsonUrl", "networktype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Variable");
		concept.put("urlParam", "variable");
		concept.put("jsonUrl", "variable");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor model");
		concept.put("urlParam", "sensormodel");
		concept.put("jsonUrl", "sensormodel");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor type");
		concept.put("urlParam", "sensortype");
		concept.put("jsonUrl", "sensortype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor location");
		concept.put("urlParam", "sensorlocation");
		concept.put("jsonUrl", "sensorlocation");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor exposure");
		concept.put("urlParam", "sensorexposure");
		concept.put("jsonUrl", "sensorexposure");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor status");
		concept.put("urlParam", "sensorstatus");
		concept.put("jsonUrl", "sensorstatus");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Data processing method");
		concept.put("urlParam", "dataprocessingmethod");
		concept.put("jsonUrl", "dataprocessingmethod");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Telecom type");
		concept.put("urlParam", "telecomtype");
		concept.put("jsonUrl", "telecomtype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Telecom service");
		concept.put("urlParam", "telecomservice");
		concept.put("jsonUrl", "telecomservice");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Telecom format");
		concept.put("urlParam", "telecomformat");
		concept.put("jsonUrl", "telecomformat");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Latency");
		concept.put("urlParam", "latency");
		concept.put("jsonUrl", "latency");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform automation");
		concept.put("urlParam", "platformautomation");
		concept.put("jsonUrl", "platformautomation");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Service type");
		concept.put("urlParam", "servicetype");
		concept.put("jsonUrl", "servicetype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform battery");
		concept.put("urlParam", "platformbattery");
		concept.put("jsonUrl", "platformbattery");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform software type");
		concept.put("urlParam", "platformsoftwaretype");
		concept.put("jsonUrl", "platformsoftwaretype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Agency role");
		concept.put("urlParam", "agencyrole");
		concept.put("jsonUrl", "agencyrole");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Contact role");
		concept.put("urlParam", "contactrole");
		concept.put("jsonUrl", "contactrole");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Deployment method");
		concept.put("urlParam", "deploymentmethod");
		concept.put("jsonUrl", "deploymentmethod");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Retrieval status");
		concept.put("urlParam", "retrievalstatus");
		concept.put("jsonUrl", "retrievalstatus");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Post retrieval status");
		concept.put("urlParam", "postretrievalstatus");
		concept.put("jsonUrl", "postretrievalstatus");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Ending cause");
		concept.put("urlParam", "endingcause");
		concept.put("jsonUrl", "endingcause");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Topic");
		concept.put("urlParam", "topic");
		concept.put("jsonUrl", "topic");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Location system");
		concept.put("urlParam", "locsystem");
		concept.put("jsonUrl", "locsystem");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Batch status");
		concept.put("urlParam", "batchstatus");
		concept.put("jsonUrl", "batchstatus");
		concepts.add(concept);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("rootUrl", Utils.getRootUrl() + Utils.getProjectVersion().substring(0, Utils.getProjectVersion().indexOf(".")) + "/");
		request.setAttribute("entityPath", Utils.getEntityPath());
		request.setAttribute("rootUrlNoVersion", Utils.getRootUrl());
		request.setAttribute("projectVersion", Utils.getProjectVersion());
		request.setAttribute("projectName", Utils.getProjectName());
		request.setAttribute("helpEditionDate", Utils.getHelpEditionDate());
		request.setAttribute("betaVersion", Utils.isBetaVersion());
		request.setAttribute("versionQualifier", Utils.getVersionQualifier());
		request.setAttribute("concepts", this.concepts);
		String jspName = "";
		
		if (request.getParameter("param") != null) {
			jspName = "GetParamValues.jsp";
			request.setAttribute("parameter", request.getParameter("param"));
			request.setAttribute("parameter_name", "Entity values");
		} else{
			jspName = "Help.jsp";
		}
		getServletContext().getRequestDispatcher("/WEB-INF/" + jspName).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
