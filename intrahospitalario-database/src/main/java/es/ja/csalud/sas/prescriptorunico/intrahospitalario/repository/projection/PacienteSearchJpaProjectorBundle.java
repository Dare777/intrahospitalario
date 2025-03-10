package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projection;

import jakarta.enterprise.context.RequestScoped;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projector.PacienteProjector;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projector.PacienteProjectorBundle;

@RequestScoped
public class PacienteSearchJpaProjectorBundle implements PacienteProjectorBundle {

	@Override
	public PacienteProjector toPacienteProjection() {
		
		return new PacienteSearchJpaProjector();
	}



}
