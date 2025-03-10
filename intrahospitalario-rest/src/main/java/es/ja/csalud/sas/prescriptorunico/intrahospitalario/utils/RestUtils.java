package es.ja.csalud.sas.prescriptorunico.intrahospitalario.utils;

import jakarta.ws.rs.core.Response;

public final class RestUtils {

	private RestUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static Response createResponse(Object entity) {
		return Response.ok(entity).build();
	}

	public static Response createResponse(Object entity, Response.Status status) {
		return Response.status(status).entity(entity).build();
	}

	public static Response createResponse(Object entity, int errorCode) {
		return Response.status(errorCode).entity(entity).build();
	}
}