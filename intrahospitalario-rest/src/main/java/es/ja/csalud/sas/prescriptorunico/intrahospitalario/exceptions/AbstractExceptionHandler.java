package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.ErrorCode;
//import es.ja.csalud.sas.autoriza.autorizaintavisas.rest.utils.RestUtils;

public abstract class AbstractExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractExceptionHandler.class.getName());

	// private static final String CODIGO = "codigo";
	// private static final String MENSAJE = "descripcion";
	
	/**
	 * Log stack trace.
	 *
	 * @param ex the exception
	 */
	protected void logStackTrace(Exception ex) {
		// Iterate exception until get root exception
		Throwable rootThrowable = ex;
		Throwable tempThrowable;
		while (null != (tempThrowable = rootThrowable.getCause())) {
			rootThrowable = tempThrowable;
		}
		// Log stack trace element
		LOGGER.error(rootThrowable.getMessage(), rootThrowable);
	}

	protected void logStackTrace(Throwable rootThrowable) {
		// Iterate exception until get root exception
		Throwable tempThrowable;
		while (null != (tempThrowable = rootThrowable.getCause())) {
			rootThrowable = tempThrowable;
		}
		// Log stack trace element
		LOGGER.error(rootThrowable.getMessage(), rootThrowable);
	}
/*
	protected Response createResponse(ErrorCode errorCode, String... messages) {
		Map<String, String> responseJson = new HashMap<>();

		responseJson.put(CODIGO, String.valueOf(errorCode.getCodigo()));
		String descripcion = errorCode.getMotivo();
		for (String message : messages) {
			descripcion = descripcion.concat(". ").concat(message);
		}
		responseJson.put(MENSAJE, descripcion);

		return RestUtils.createResponse(responseJson, errorCode.getCodigo());
	}*/
}
