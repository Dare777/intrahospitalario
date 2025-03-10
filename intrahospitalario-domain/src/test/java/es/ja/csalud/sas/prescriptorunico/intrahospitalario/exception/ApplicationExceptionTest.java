package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exception;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ApplicationExceptionTest {

	@Mock
	private Throwable cause;
/* 
	@Test
	public void testConstructorWithErrorCode() {
		ApplicationException exception = new ApplicationException(BusinessErrorCode.BUSS_001);
		assertEquals(BusinessErrorCode.BUSS_001, exception.getErrorCode());
	}

	@Test
	public void testConstructorWithMessage() {
		String message = "Test message";
		ApplicationException exception = new ApplicationException(message);

		assertEquals(message, exception.getMessage());
		assertEquals(null, exception.getErrorCode());
	}

	@Test
	public void testConstructorWithCause() {
		ApplicationException exception = new ApplicationException(cause);
		assertEquals(cause, exception.getCause());
	}

	@Test
	public void testConstructorWithMessageAndErrorCode() {
		String message = "Test message";
		ApplicationException exception = new ApplicationException(BusinessErrorCode.BUSS_001, message);

		assertEquals(BusinessErrorCode.BUSS_001.getCodigo(), exception.getErrorCode().getCodigo());
		assertEquals(BusinessErrorCode.BUSS_001.getMotivo() + message, exception.getMessage());
		assertEquals(BusinessErrorCode.BUSS_001, exception.getErrorCode());
	}

	@Test
	public void testConstructorWithErrorCodeAndCause() {
		ApplicationException exception = new ApplicationException(BusinessErrorCode.BUSS_001, cause);

		assertEquals(cause, exception.getCause());
		assertEquals(BusinessErrorCode.BUSS_001, exception.getErrorCode());
	}

	@Test
	public void testConstructorWithMessageAndCause() {
		String message = "Test message";
		ApplicationException exception = new ApplicationException(message, cause);

		assertEquals(message, exception.getMessage());
		assertEquals(null, exception.getErrorCode());
		assertEquals(cause, exception.getCause());
	}

	@Test
	public void testConstructorWithMessageCauseAndErrorCode() {
		String message = "Test message";
		ApplicationException exception = new ApplicationException(TechnicalErrorCode.TECH_001, message, cause);

		assertEquals(TechnicalErrorCode.TECH_001.getCodigo(), exception.getErrorCode().getCodigo());
		assertEquals(TechnicalErrorCode.TECH_001.getMotivo() + message, exception.getMessage());
		assertEquals(TechnicalErrorCode.TECH_001, exception.getErrorCode());
		assertEquals(cause, exception.getCause());
	}*/
}