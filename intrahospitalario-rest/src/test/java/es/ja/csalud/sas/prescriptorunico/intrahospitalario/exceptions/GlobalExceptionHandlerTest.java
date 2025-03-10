package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.TechnicalErrorCode;
//import es.ja.csalud.sas.componentescomunes.sasconfiguration.exception.TransformationException;

@ExtendWith(MockitoExtension.class)
public class GlobalExceptionHandlerTest {
/*
	@Mock
	private TransformationException transformationException;

	@InjectMocks
	private GlobalExceptionHandler globalExceptionHandler;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
    public void testToResponseWithTransformationException() {
        when(transformationException.getMessage()).thenReturn("Transformation Exception");

        Response response = globalExceptionHandler.toResponse(transformationException);

        assertNotNull(response);
        assertEquals(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), response.getStatus());
        assertEquals(TechnicalErrorCode.TECH_011.getCodigo(), response.getStatus());
    }

	@Test
	public void testToResponseWithOtherException() {
		Exception exception = new Exception("Other Exception");

		Response response = globalExceptionHandler.toResponse(exception);

		assertNotNull(response);
		assertEquals(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), response.getStatus());
		assertEquals(TechnicalErrorCode.TECH_010.getCodigo(), response.getStatus());
	}*/
}
