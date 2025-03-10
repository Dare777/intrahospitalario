package es.ja.csalud.sas.prescriptorunico.intrahospitalario.use_case;

import java.util.Collection;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import es.ja.csalud.sas.framework.domain.repository.specification.Specification;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.criteria.PacienteCriteria;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.projection.PacienteProjection;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.PacienteRepository;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projector.PacienteProjectorBundle;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification.PacienteSpecificationFactory;

@RequestScoped
public class PacienteSearchServiceImpl implements PacienteSearchService {

	private final PacienteRepository repository;
	private final PacienteSpecificationFactory specificationFactory;
	private final PacienteProjectorBundle projectorBundle;

	@Inject
	public PacienteSearchServiceImpl(
			PacienteRepository repository, 
			PacienteSpecificationFactory specificationFactory,
			PacienteProjectorBundle projectorBundle) {
		this.repository = repository;
		this.specificationFactory = specificationFactory;
		this.projectorBundle = projectorBundle;
	}

	@Override
	public Collection<PacienteProjection> findByCriteria(PacienteCriteria searchFilters) {
		Specification<Paciente, Long> specificationFilter = specificationFactory
				.createFilterSpecification(searchFilters);

		return repository
				.project(
						PacienteProjection.class, 
						projectorBundle.toPacienteProjection())
				.findBy(specificationFilter)
				.asCollection();
	}
}
