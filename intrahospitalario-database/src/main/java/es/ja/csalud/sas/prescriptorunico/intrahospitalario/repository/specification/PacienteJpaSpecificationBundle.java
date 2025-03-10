package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;
import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.specification.JpaSpecificationBundle;

import jakarta.enterprise.context.RequestScoped;

/**
 * The type Hospital jpa specification bundle.
 */
@RequestScoped
public class PacienteJpaSpecificationBundle implements PacienteSpecificationBundle, JpaSpecificationBundle<PacienteEntity, Paciente, Long> {

	@Override
	public PacienteSpecification filterById(Long id) {

		return new PacienteIdJpaSpecification(id);
	}
}