package es.ja.csalud.sas.prescriptorunico.intrahospitalario.controller;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.anyString;
// import static org.mockito.Mockito.mock;
// import static org.mockito.Mockito.times;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
// import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class PacienteRestControllerTest {

	@InjectMocks
	private PacienteRestController controller;
    
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
}