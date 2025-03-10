package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;

public class PacienteIdJpaSpecification extends PacienteJpaSpecification {
	
	private final Long id;
	

	public PacienteIdJpaSpecification(Long id) {
		super();
		this.id = id;
	}


	@Override
	public Predicate asPredicate(CriteriaBuilder criteriaBuilder, Root<PacienteEntity> root, CriteriaQuery<?> criteriaQuery) {
		return criteriaBuilder.equal(root.get("id"), id);
		
	}

}
