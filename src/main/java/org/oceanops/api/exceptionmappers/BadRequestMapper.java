package org.oceanops.api.exceptionmappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Provider
public class BadRequestMapper implements ExceptionMapper<jakarta.ws.rs.BadRequestException> {
	private final Logger logger = LoggerFactory.getLogger(BadRequestMapper.class);
	
	public Response toResponse(jakarta.ws.rs.BadRequestException ex) {
		logger.trace(ex.getMessage());
		return Response.status(Status.BAD_REQUEST.getStatusCode()).entity("{\"success\": false, \"errorMessage\": \"" + ex.getMessage() + "\"}").type("application/json").build();
	}
}
