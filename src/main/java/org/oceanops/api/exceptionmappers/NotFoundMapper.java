package org.oceanops.api.exceptionmappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class NotFoundMapper implements ExceptionMapper<jakarta.ws.rs.NotFoundException> {
	private final Logger logger = LoggerFactory.getLogger(NotFoundMapper.class);
	
	public Response toResponse(jakarta.ws.rs.NotFoundException ex) {
		logger.trace(ex.getMessage());
		return Response.status(404).entity("{\"success\": false, \"errorMessage\": \"" + ex.getMessage() + "\"}").type("application/json").build();
	}
}
