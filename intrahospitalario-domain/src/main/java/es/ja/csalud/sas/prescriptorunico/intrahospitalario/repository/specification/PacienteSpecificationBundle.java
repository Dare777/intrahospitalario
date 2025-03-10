package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.framework.domain.repository.specification.SpecificationBundle;

public interface PacienteSpecificationBundle extends SpecificationBundle<Paciente, Long> {
	
	/**
	 * Filter by id sppecification.
	 * 
	 * @param id the id
	 * @return the specification
	 */
	PacienteSpecification filterById(Long id);
}