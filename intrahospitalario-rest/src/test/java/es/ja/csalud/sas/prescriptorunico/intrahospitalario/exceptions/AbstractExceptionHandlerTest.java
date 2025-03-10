package es.ja.csalud.sas.prescriptorunico.intrahospitalario.exceptions;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;

// import java.util.Map;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
// import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//import es.ja.csalud.sas.autoriza.autorizaintavisas.domain.exceptions.ErrorCode;

@ExtendWith(MockitoExtension.class)
class AbstractExceptionHandlerTest {

    @InjectMocks
    private AbstractExceptionHandlerImpl handler;
/*
    @Mock
    private ErrorCode errorCode;

    @BeforeEach
    void setUp() {
        when(errorCode.getCodigo()).thenReturn(404);
        when(errorCode.getMotivo()).thenReturn("Not Found");
    }

    @Test
    void testCreateResponse_WithSingleMessage() {
        Response response = handler.createResponse(errorCode, "Error Detail 1");
        Map<String, Object> responseBody = (Map<String, Object>) response.getEntity();
        assertEquals(404, response.getStatus());
        assertEquals("404", responseBody.get("codigo"));
        assertEquals("Not Found. Error Detail 1", responseBody.get("descripcion"));
    }

    @Test
    void testCreateResponse_WithMultipleMessages() {
        Response response = handler.createResponse(errorCode, "Error Detail 1", "Error Detail 2");
        Map<String, Object> responseBody = (Map<String, Object>) response.getEntity();
        assertEquals(404, response.getStatus());
        assertEquals("404", responseBody.get("codigo"));
        assertEquals("Not Found. Error Detail 1. Error Detail 2", responseBody.get("descripcion"));
    }

    @Test
    void testCreateResponse_WithoutMessages() {
        Response response = handler.createResponse(errorCode);
        Map<String, Object> responseBody = (Map<String, Object>) response.getEntity();
        assertEquals(404, response.getStatus());
        assertEquals("404", responseBody.get("codigo"));
        assertEquals("Not Found", responseBody.get("descripcion"));
    }*/
}

class AbstractExceptionHandlerImpl extends AbstractExceptionHandler {
}