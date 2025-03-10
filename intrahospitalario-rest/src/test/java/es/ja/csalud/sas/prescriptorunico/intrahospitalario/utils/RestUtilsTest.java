package es.ja.csalud.sas.prescriptorunico.intrahospitalario.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RestUtilsTest {

    @Test
    public void testCreateResponseWithEntity() {
        Object entity = new Object();
        try (Response expectedResponse = Response.ok(entity).build();
             Response actualResponse = RestUtils.createResponse(entity)) {
            assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
            assertEquals(expectedResponse.getEntity(), actualResponse.getEntity());
        }
    }

    @Test
    public void testCreateResponseWithEntityAndStatus() {
        Object entity = new Object();
        Response.Status status = Response.Status.BAD_REQUEST;
        try (Response expectedResponse = Response.status(status).entity(entity).build();
             Response actualResponse = RestUtils.createResponse(entity, status)) {
            assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
            assertEquals(expectedResponse.getEntity(), actualResponse.getEntity());
        }
    }

    @Test
    public void testCreateResponseWithEntityAndErrorCode() {
        Object entity = new Object();
        int errorCode = 400;
        try (Response expectedResponse = Response.status(errorCode).entity(entity).build();
             Response actualResponse = RestUtils.createResponse(entity, errorCode)) {
            assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
            assertEquals(expectedResponse.getEntity(), actualResponse.getEntity());
        }
    }

    @Test
    public void testPrivateConstructor() throws NoSuchMethodException {
        Constructor<RestUtils> constructor = RestUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        InvocationTargetException exception = assertThrows(InvocationTargetException.class, constructor::newInstance);
        assertEquals(IllegalStateException.class, exception.getCause().getClass());
        assertEquals("Utility class", exception.getCause().getMessage());
    }
}
