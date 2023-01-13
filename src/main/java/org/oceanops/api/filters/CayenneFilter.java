package org.oceanops.api.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import org.apache.cayenne.BaseContext;
import org.oceanops.api.Application;

public class CayenneFilter implements Filter {
	private String pathToBeIgnored;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String path = ((HttpServletRequest) request).getRequestURI();
		if(pathToBeIgnored == null){
			BaseContext.bindThreadObjectContext(Application.CAYENNE_RUNTIME.newContext());
        }
        else if(!path.endsWith(pathToBeIgnored)){
			BaseContext.bindThreadObjectContext(Application.CAYENNE_RUNTIME.newContext());
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		pathToBeIgnored = filterConfig.getInitParameter("pathToBeIgnored");
	}
}