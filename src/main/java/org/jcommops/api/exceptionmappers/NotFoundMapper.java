package org.jcommops.api.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Provider
public class NotFoundMapper implements ExceptionMapper<javax.ws.rs.NotFoundException> {
	private Log log = LogFactory.getLog(NotFoundMapper.class);
	
	public Response toResponse(javax.ws.rs.NotFoundException ex) {
		log.trace(ex.getMessage());
		return Response.status(404).entity("{\"success\": false, \"errorMessage\": \"" + ex.getMessage() + "\"}").type("application/json").build();
	}
}
