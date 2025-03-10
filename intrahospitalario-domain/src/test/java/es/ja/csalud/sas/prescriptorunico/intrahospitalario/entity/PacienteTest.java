package es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

	private Paciente paciente;
	
	@BeforeEach
	void setUp() {
		paciente = new Paciente();
	}
	
    @Test
    void testGetAndSetId() {
    	Long id = 1L;
    	paciente.setId(id);
    	assertEquals(id, paciente.getId());
    }
    
    @Test
    void testGetDomainId() {
        Long id = 1L;
    	paciente.setId(id);
    	assertEquals(id, paciente.getDomainId());
    }
    
    @Test
    void testSetDomainId() {
        Long id = 1L;
        paciente.setDomainId(id);
        assertEquals(id, paciente.getId());
    }
    
    @Test
    void testEquals() {
    	Paciente paciente1 = new Paciente();
    	Paciente paciente2 = new Paciente();
    	paciente1.setId(1L);
    	paciente2.setId(1L);
        assertEquals(paciente1, paciente2);
    }
    
    @Test
    void testNotEquals() {
    	Paciente paciente1 = new Paciente();
    	Paciente paciente2 = new Paciente();
    	paciente1.setId(1L);
    	paciente2.setId(1L);
    	assertNotEquals(paciente1, paciente2);
    }
    
    @Test
    void testHashCode() {
    	Paciente paciente1 = new Paciente();
    	Paciente paciente2 = new Paciente();
    	paciente1.setId(1L);
    	paciente2.setId(1L);
    	assertEquals(paciente1.hashCode(), paciente2.hashCode());
    }
    
    @Test
    void testHashCodeNotEquals() {
    	Paciente paciente1 = new Paciente();
    	Paciente paciente2 = new Paciente();
    	paciente1.setId(1L);
    	paciente2.setId(1L);
    	assertNotEquals(paciente1.hashCode(), paciente2.hashCode());
    }
}