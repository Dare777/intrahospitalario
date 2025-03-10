package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.specification;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;

import jakarta.enterprise.context.RequestScoped;

import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.specification.CompositeJpaSpecification;

@RequestScoped
public abstract class PacienteJpaSpecification implements CompositeJpaSpecification<PacienteEntity, Paciente, Long>, PacienteSpecification {

}