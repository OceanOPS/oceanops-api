package org.oceanops.api.filters;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.oceanops.api.Utils;

public class CayenneFilter implements Filter {

	@Override
	public void destroy() {
		Utils.getCayenneRuntime().shutdown();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try{
			Utils.initCayenneRuntime();
		}
		catch(NamingException e){
			throw new IOException("Impossible to establish a connection with the database");
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
