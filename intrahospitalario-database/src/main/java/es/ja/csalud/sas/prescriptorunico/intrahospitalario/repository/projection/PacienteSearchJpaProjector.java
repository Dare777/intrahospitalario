package es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projection;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Selection;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.repository.projector.PacienteProjector;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.projection.PacienteProjection;
import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.projection.JpaProjector;


@RequestScoped
public class PacienteSearchJpaProjector 
	implements JpaProjector<PacienteEntity, PacienteProjection>, PacienteProjector {

    public Selection<PacienteProjection> asSelection(CriteriaBuilder criteriaBuilder, Root<PacienteEntity> root) {
        return criteriaBuilder.construct(PacienteProjection.class, createSelection(root));
    }

    private Path<?>[] createSelection(Root<PacienteEntity> root) {
        List<Path<Object>> listSelection = new ArrayList<>();

        listSelection.add(root.get("id"));
        
        return listSelection.toArray(new Path[listSelection.size()]);
    }


}
