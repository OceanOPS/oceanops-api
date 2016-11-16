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
public class APIDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public APIDoc() {
		super();
	}

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getScheme() + "://" + request.getServerName()+  ":" + request.getServerPort() + request.getRequestURI().replace("/help","/") ;   
		request.setAttribute("uri", uri);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Help.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getScheme() + "://" + request.getServerName()+  ":" + request.getServerPort() + request.getRequestURI().replace("/help","/") ;   
		request.setAttribute("uri", uri);
	
		if (request.getParameter("StatusValues") != null) {
			request.setAttribute("parameter", "ptfStatuses.json");
			request.setAttribute("parameter_name", "Platform Statuses");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
							
					
		}
		

		if (request.getParameter("ModelValues") != null) {
			request.setAttribute("parameter", "ptfModels.json");
			request.setAttribute("parameter_name", "Platform Models");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
							
		}
		if (request.getParameter("TypeValues") != null) {

			request.setAttribute("parameter", "ptfTypes.json");
			request.setAttribute("parameter_name", "Platform Types");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("FamilyValues") != null) {

			request.setAttribute("parameter", "ptfFamilies.json");
			request.setAttribute("parameter_name", "Platform Families");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("NetworkValues") != null) {

			request.setAttribute("parameter", "networks.json");
			request.setAttribute("parameter_name", "Networks");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("ProgramValues") != null) {

			request.setAttribute("parameter", "programs.json");
			request.setAttribute("parameter_name", "Programes");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("MasterProgramValues") != null) {

			request.setAttribute("parameter", "masterPrograms.json");
			request.setAttribute("parameter_name", "Master Programes");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("VariableValues") != null) {

			request.setAttribute("parameter", "variables.json");
			request.setAttribute("parameter_name", "Variables");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
		
					
		}
		if (request.getParameter("SensorModelValues") != null) {

			request.setAttribute("parameter", "sensorModels.json");
			request.setAttribute("parameter_name", "Sensor Models");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("SensorTypeValues") != null) {

			request.setAttribute("parameter", "sensorTypes.json");
			request.setAttribute("parameter_name", "Sensor Types");
			getServletContext().getRequestDispatcher("/WEB-INF/GetParamValues.jsp").forward(request, response);
		
		
					
		}
		
		

	}
	
}
