package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification;

import es.ja.csalud.sas.framework.domain.repository.specification.Specification;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.criteria.PacienteCriteria;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;

public interface PacienteSpecificationFactory {

	Specification<Paciente, Long> createFilterSpecification(PacienteCriteria searchFilters);

}
