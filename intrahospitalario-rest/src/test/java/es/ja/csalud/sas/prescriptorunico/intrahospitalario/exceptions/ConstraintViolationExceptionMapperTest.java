package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.when;

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.TechnicalErrorCode;

@ExtendWith(MockitoExtension.class)
class ConstraintViolationExceptionMapperTest {

	// private ConstraintViolationExceptionMapper exceptionMapper;

	@Mock
	private ConstraintViolationException exception;

	@Mock
	private ConstraintViolation<?> violation1;

	@Mock
	private ConstraintViolation<?> violation2;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		// exceptionMapper = new ConstraintViolationExceptionMapper();
	}
/*
	@Test
	void toResponse_ShouldReturnErrorResponse() {
		Set<ConstraintViolation<?>> violations = new HashSet<>(Arrays.asList(violation1, violation2));
		when(exception.getConstraintViolations()).thenReturn(violations);
		when(violation1.getMessage()).thenReturn("Violation 1");
		when(violation2.getMessage()).thenReturn("Violation 2");		
		
		Response response = exceptionMapper.toResponse(exception);

		assertNotNull(response);
		assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
		assertEquals(TechnicalErrorCode.TECH_003.getCodigo(), response.getStatus());
	}*/
}