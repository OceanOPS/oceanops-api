package org.jcommops.api;

import java.io.IOException;
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

	public Help() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("rootUrl", Utils.getRootUrl());
		request.setAttribute("rootUrlNoVersion", Utils.getRootUrl().substring(0, Utils.getRootUrl().length() - Utils.getProjectVersion().length() - 1));
		request.setAttribute("projectVersion", Utils.getProjectVersion());
		request.setAttribute("projectName", Utils.getProjectName());
		request.setAttribute("helpEditionDate", Utils.getHelpEditionDate());
		String jspName = "";
		
		if (request.getParameter("param") != null) {
			jspName = "GetParamValues.jsp";
			switch (request.getParameter("param")) {
			case "status":
				request.setAttribute("parameter", "ptf_statuses.json");
				request.setAttribute("parameter_name", "Platform statuses");
				break;
			case "model":
				request.setAttribute("parameter", "ptf_models.json");
				request.setAttribute("parameter_name", "Platform models");
				break;
			case "type":
				request.setAttribute("parameter", "ptf_types.json");
				request.setAttribute("parameter_name", "Platform types");
				break;
			case "family":
				request.setAttribute("parameter", "ptf_families.json");
				request.setAttribute("parameter_name", "Platform families");
				break;
			case "network":
				request.setAttribute("parameter", "networks.json");
				request.setAttribute("parameter_name", "Networks");
				break;
			case "program":
				request.setAttribute("parameter", "programs.json");
				request.setAttribute("parameter_name", "Programs");
				break;
			case "masterProgram":
				request.setAttribute("parameter", "master_programs.json");
				request.setAttribute("parameter_name", "Master programs");
				break;
			case "variable":
				request.setAttribute("parameter", "variables.json");
				request.setAttribute("parameter_name", "Variables");
				jspName = "GetVariableValues.jsp";
				break;
			case "sensorModel":
				request.setAttribute("parameter", "sensor_models.json");
				request.setAttribute("parameter_name", "Sensor models");
				break;
			case "sensorType":
				request.setAttribute("parameter", "sensor_types.json");
				request.setAttribute("parameter_name", "Sensor types");
				break;
			case "country":
				request.setAttribute("parameter", "countries.json");
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
