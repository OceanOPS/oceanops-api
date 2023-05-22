package org.oceanops.api.exceptionmappers;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class NotAuthorizedMapper implements ExceptionMapper<jakarta.ws.rs.NotAuthorizedException> {
	private final Logger logger = LoggerFactory.getLogger(NotAuthorizedMapper.class);
    
	public Response toResponse(jakarta.ws.rs.NotAuthorizedException ex) {
		logger.trace(ex.getMessage());
		return Response.status(Status.UNAUTHORIZED).entity("{\"errorMessage\": \"" + ex.getMessage() + "\"}").type(MediaType.APPLICATION_JSON).build();
	}
}