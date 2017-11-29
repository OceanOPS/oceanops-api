package org.jcommops.api.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Provider
public class BadRequestMapper implements ExceptionMapper<javax.ws.rs.BadRequestException> {
	private Log log = LogFactory.getLog(BadRequestMapper.class);
	
	public Response toResponse(javax.ws.rs.BadRequestException ex) {
		log.trace(ex.getMessage());
		return Response.status(Status.BAD_REQUEST.getStatusCode()).entity("{\"success\": false, \"errorMessage\": \"" + ex.getMessage() + "\"}").type("application/json").build();
	}
}
