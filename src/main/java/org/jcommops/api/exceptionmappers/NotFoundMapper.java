package org.jcommops.api.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class NotFoundMapper implements ExceptionMapper<javax.ws.rs.NotFoundException> {
	private final Logger logger = LoggerFactory.getLogger(NotFoundMapper.class);
	
	public Response toResponse(javax.ws.rs.NotFoundException ex) {
		logger.trace(ex.getMessage());
		return Response.status(404).entity("{\"success\": false, \"errorMessage\": \"" + ex.getMessage() + "\"}").type("application/json").build();
	}
}
