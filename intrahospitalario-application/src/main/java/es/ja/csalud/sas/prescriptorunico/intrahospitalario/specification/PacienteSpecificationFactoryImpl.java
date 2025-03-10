package es.ja.csalud.sas.prescriptorunico.intrahospitalario.specification;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import es.ja.csalud.sas.framework.domain.repository.specification.Specification;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.criteria.PacienteCriteria;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification.PacienteSpecificationBundle;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification.PacienteSpecificationFactory;

@RequestScoped
public class PacienteSpecificationFactoryImpl implements PacienteSpecificationFactory{

	private final PacienteSpecificationBundle specificationBundle;

	@Inject
	public PacienteSpecificationFactoryImpl(PacienteSpecificationBundle specificationBundle) {
		super();
		this.specificationBundle = specificationBundle;
	}

	@Override
	public Specification<Paciente, Long> createFilterSpecification(PacienteCriteria searchFilter) {
		Specification<Paciente, Long> specification = specificationBundle.emptySpecification();

		if (null != searchFilter) {
			specification = filterById(searchFilter, specification);
		}

		return specification;
	}

	private Specification<Paciente, Long> filterById(PacienteCriteria searchFilter, 
			Specification<Paciente, Long> specification) {
		if (null != searchFilter.getId()) {
			specification = specification.and(specificationBundle.filterById(searchFilter.getId()));
		}
		return specification;
	}
	


}
