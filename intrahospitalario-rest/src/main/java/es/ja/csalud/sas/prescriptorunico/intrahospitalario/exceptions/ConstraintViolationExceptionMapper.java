package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

import jakarta.inject.Singleton;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.TechnicalErrorCode;

@Provider
@Singleton
public class ConstraintViolationExceptionMapper extends AbstractExceptionHandler
		implements ExceptionMapper<ConstraintViolationException> {

		@Override
		public Response toResponse(ConstraintViolationException exception) {
			// TODO Auto-generated method stub
			return null;
		}
	/* 
	@Override
	public Response toResponse(ConstraintViolationException exception) {
		Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();

		List<String> messages = new ArrayList<>();
		for (ConstraintViolation<?> violation : violations) {
			messages.add(violation.getMessage());
		}

		logStackTrace(exception);
		return createResponse(TechnicalErrorCode.TECH_003, messages.toArray(new String[0]));
	}*/
}