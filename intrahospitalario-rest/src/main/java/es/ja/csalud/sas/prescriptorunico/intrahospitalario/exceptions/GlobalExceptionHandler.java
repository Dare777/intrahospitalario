package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

// import java.util.ArrayList;
// import java.util.List;

import jakarta.inject.Singleton;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.TechnicalErrorCode;
//import es.ja.csalud.sas.componentescomunes.sasconfiguration.exception.TransformationException;

@Provider
@Singleton
public class GlobalExceptionHandler extends AbstractExceptionHandler implements ExceptionMapper<Throwable> {
	@Override
	public Response toResponse(Throwable exception) {
		// TODO Auto-generated method stub
		return null;
	}
/*
	@Override
	public Response toResponse(Throwable exception) {

		// TransformationException
		if (exception instanceof TransformationException) {
			List<String> messages = new ArrayList<>();
			logStackTrace(exception);
			return createResponse(TechnicalErrorCode.TECH_011, messages.toArray(new String[0]));
		} else {
			List<String> messages = new ArrayList<>();
			messages.add(exception.getMessage());
			logStackTrace(exception);
			return createResponse(TechnicalErrorCode.TECH_010, messages.toArray(new String[0]));
		}
	}*/
}