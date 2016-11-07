package org.jcommops.api.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jcommops.api.Utils;

public class CayenneFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Utils.initCayenneRuntime();
		chain.doFilter(request, response);
		Utils.getCayenneRuntime().shutdown();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}