package org.oceanops.api;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class
 */
public class OpenApiDefinition extends HttpServlet{

    public OpenApiDefinition(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/yaml");
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/classes/oceanops-api.yaml");
        view.forward(request, response);
    }
}
