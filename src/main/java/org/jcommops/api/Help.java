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
		request.setAttribute("projectVersion", Utils.getProjectVersion());
		request.setAttribute("projectName", Utils.getProjectName());
		String jspName = "";
		
		if (request.getParameter("param") != null) {
			jspName = "GetParamValues.jsp";
			switch (request.getParameter("param")) {
			case "status":
				request.setAttribute("parameter", "ptfStatuses.json");
				request.setAttribute("parameter_name", "Platform Statuses");
				break;
			case "model":
				request.setAttribute("parameter", "ptfModels.json");
				request.setAttribute("parameter_name", "Platform Models");
				break;
			case "type":
				request.setAttribute("parameter", "ptfTypes.json");
				request.setAttribute("parameter_name", "Platform Types");
				break;
			case "family":
				request.setAttribute("parameter", "ptfFamilies.json");
				request.setAttribute("parameter_name", "Platform Families");
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
				request.setAttribute("parameter", "masterPrograms.json");
				request.setAttribute("parameter_name", "Master Programs");
				break;
			case "variable":
				request.setAttribute("parameter", "variables.json");
				request.setAttribute("parameter_name", "Variables");
				jspName = "GetVariableValues.jsp";
				break;
			case "sensorModel":
				request.setAttribute("parameter", "sensorModels.json");
				request.setAttribute("parameter_name", "Sensor Models");
				break;
			case "sensorType":
				request.setAttribute("parameter", "sensorTypes.json");
				request.setAttribute("parameter_name", "Sensor Types");
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
