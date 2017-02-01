package org.jcommops.api.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Provider
public class ErrorMapper implements ExceptionMapper<Exception> {
	private Log log = LogFactory.getLog(ErrorMapper.class);

	public Response toResponse(Exception ex) {
		log.error(ex.getMessage(), ex);
		return Response.status(500).entity("{\"success\": false, \"errorMessage\": \"Error while retrieving data\"}").type("text/plain").build();
	}

}
