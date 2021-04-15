package org.oceanops.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class
 */
@WebServlet("/help")
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
		concept.put("name", "Agency role");
		concept.put("urlParam", "agencyrole");
		concept.put("jsonUrl", "agencyrole");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Contact role");
		concept.put("urlParam", "contactrole");
		concept.put("jsonUrl", "contactrole");
		concepts.add(concept);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("rootUrl", Utils.getRootUrl());
		if(Utils.isBetaVersion())
			request.setAttribute("rootUrlNoVersion", Utils.getRootUrl().substring(0, Utils.getRootUrl().length() - "preview".length() - 1));
		else
			request.setAttribute("rootUrlNoVersion", Utils.getRootUrl().substring(0, Utils.getRootUrl().length() - Utils.getProjectVersion().length() - 1));
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
