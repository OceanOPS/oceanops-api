package org.oceanops.api;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
