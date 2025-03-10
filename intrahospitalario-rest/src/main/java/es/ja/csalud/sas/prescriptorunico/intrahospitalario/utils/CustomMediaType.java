package es.ja.csalud.sas.prescriptorunico.intrahospitalario.utils;

import jakarta.ws.rs.core.MediaType;

public class CustomMediaType {

	public static final String APPLICATION_JSON_UTF8 = MediaType.APPLICATION_JSON + ";charset=UTF-8";

	private CustomMediaType() {
		throw new IllegalStateException("Utility class");
	}
}
