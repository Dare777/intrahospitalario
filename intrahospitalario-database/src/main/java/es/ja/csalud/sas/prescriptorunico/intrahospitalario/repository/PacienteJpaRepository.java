package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;

import es.ja.csalud.sas.framework.domain.mapper.Mapper;
import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.JpaContext;
import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.JpaRepository;

@RequestScoped
public class PacienteJpaRepository extends JpaRepository<PacienteEntity, Paciente, Long> implements PacienteRepository {
    
	@Inject
    public PacienteJpaRepository(EntityManager em, Mapper<Paciente, PacienteEntity> mapper) {
        super(new JpaContext<>(em, mapper, PacienteEntity.class, Paciente.class));
    }

}