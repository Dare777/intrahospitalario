package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@ApplicationScoped
public class EntityManagerProducer {

    @PersistenceContext(unitName = "database-unit")
    private EntityManager entityManager;

    @Produces
    @RequestScoped
    public EntityManager create() {
        return entityManager;
    }

}

