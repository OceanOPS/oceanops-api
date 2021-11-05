package org.oceanops.api.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.oceanops.api.Authentication;

public class AuthFilter implements Filter {
    
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        //Enumeration<String> headerNames = httpRequest.getHeaderNames();
		
		if(httpRequest.getHeader("X-OceanOPS-Metadata-ID") != null){
			Integer id = Integer.parseInt(httpRequest.getHeader("X-OceanOPS-Metadata-ID"));
			String token = httpRequest.getHeader("X-OceanOPS-Metadata-Token");
			String serviceIdentifier = httpRequest.getHeader("X-OceanOPS-Metadata-ServiceIdentifier");
			String serviceToken = httpRequest.getHeader("X-OceanOPS-Metadata-ServiceToken");

			new Authentication(id, token, serviceIdentifier, serviceToken);
		}
		else{
			Authentication.reset();
		}
        
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
}
