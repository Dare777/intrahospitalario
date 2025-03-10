package es.ja.csalud.sas.prescriptorunico.intrahospitalario.use_case;

import java.util.Collection;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.criteria.PacienteCriteria;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.projection.PacienteProjection;

public interface PacienteSearchService {	
    Collection<PacienteProjection> findByCriteria(PacienteCriteria searchFilters);	
}