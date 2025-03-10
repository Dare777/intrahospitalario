package es.ja.csalud.sas.prescriptorunico.intrahospitalario.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
// import static org.mockito.Mockito.mockStatic;

import jakarta.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;
// import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CustomMediaTypeTest {

    @Test
    void testApplicationJsonUtf8() {
        assertEquals(CustomMediaType.APPLICATION_JSON_UTF8, MediaType.APPLICATION_JSON + ";charset=UTF-8");
    }

    @Test
    void testPrivateConstructor() throws NoSuchMethodException {
        Constructor<CustomMediaType> constructor = CustomMediaType.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        InvocationTargetException exception = assertThrows(InvocationTargetException.class, constructor::newInstance);
        assertEquals(IllegalStateException.class, exception.getCause().getClass());
        assertEquals("Utility class", exception.getCause().getMessage());
    }
}
