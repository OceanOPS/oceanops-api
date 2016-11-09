package org.jcommops.api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class 
 */
@WebServlet("/help")
public class APIDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private HttpSession session;

	public APIDoc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/Help.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		
		if (request.getParameter("StatusValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/StatusValues.jsp").forward(request, response);
					
		}
			
		if (request.getParameter("ModelValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/ModelValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("TypeValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/TypeValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("FamilyValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/FamilyValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("NetworkValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/NetworkValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("ProgramValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/ProgramValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("MasterProgramValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/MasterProgramValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("VariableValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/VariableValues.jsp").forward(request, response);
		
					
		}
		if (request.getParameter("SensorModelValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/SensorModelValues.jsp").forward(request, response);
		
					
		}
		
		if (request.getParameter("SensorTypeValues") != null) {

			getServletContext().getRequestDispatcher("/WEB-INF/SensorTypeValues.jsp").forward(request, response);
		
					
		}
		
		

	}
	
}
