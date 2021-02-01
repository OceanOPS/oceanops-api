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
		concept.put("urlParam", "status");
		concept.put("jsonUrl", "platformstatus");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform model");
		concept.put("urlParam", "model");
		concept.put("jsonUrl", "platformmodel");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform type");
		concept.put("urlParam", "type");
		concept.put("jsonUrl", "platformtype");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Platform family");
		concept.put("urlParam", "family");
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
		concept.put("urlParam", "sensorModel");
		concept.put("jsonUrl", "sensormodel");
		concepts.add(concept);
		concept = new HashMap<String, String>();
		concept.put("name", "Sensor type");
		concept.put("urlParam", "sensorType");
		concept.put("jsonUrl", "sensortype");
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
			switch (request.getParameter("param")) {
			case "status":
				request.setAttribute("parameter", "platformstatus");
				request.setAttribute("parameter_name", "Platform statuses");
				break;
			case "model":
				request.setAttribute("parameter", "platformmodel");
				request.setAttribute("parameter_name", "Platform models");
				break;
			case "type":
				request.setAttribute("parameter", "platformtype");
				request.setAttribute("parameter_name", "Platform types");
				break;
			case "family":
				request.setAttribute("parameter", "platformfamily");
				request.setAttribute("parameter_name", "Platform families");
				break;
			case "network":
				request.setAttribute("parameter", "network");
				request.setAttribute("parameter_name", "Networks");
				break;
			case "program":
				request.setAttribute("parameter", "program");
				request.setAttribute("parameter_name", "Programs");
				jspName = "GetParamValuesWIGOS.jsp";
				break;
			case "masterProgram":
				request.setAttribute("parameter", "observingnetwork");
				request.setAttribute("parameter_name", "Observing networks");
				break;
			case "variable":
				request.setAttribute("parameter", "variable");
				request.setAttribute("parameter_name", "Variables");
				jspName = "GetVariableValues.jsp";
				break;
			case "sensorModel":
				request.setAttribute("parameter", "sensormodel");
				request.setAttribute("parameter_name", "Sensor models");
				break;
			case "sensorType":
				request.setAttribute("parameter", "sensortype");
				request.setAttribute("parameter_name", "Sensor types");
				break;
			case "country":
				request.setAttribute("parameter", "country");
				request.setAttribute("parameter_name", "Countries");
				jspName = "GetCountryValues.jsp";
				break;
			default:
				break;
			}
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
