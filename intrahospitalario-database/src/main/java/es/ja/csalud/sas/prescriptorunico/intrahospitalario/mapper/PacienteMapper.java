package es.ja.csalud.sas.prescriptorunico.intrahospitalario.mapper;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.Paciente;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity.PacienteEntity;

import java.util.Objects;
import jakarta.enterprise.context.ApplicationScoped;
import es.ja.csalud.sas.framework.infraestructura.database.jpa.mapper.BaseJpaMapper;

/**
 * The type Paciente mapper.
 */
@ApplicationScoped
public class PacienteMapper extends BaseJpaMapper<Paciente, PacienteEntity> {

    @Override
    public PacienteEntity mapTo(Paciente source) {
        return mapTo(source, new PacienteEntity());
    }

    @Override
    public PacienteEntity mapTo(Paciente source, PacienteEntity destination) {
		if(Objects.isNull(source)) {
            return null;
		}
        if(Objects.isNull(destination)) {
            return mapTo(source);
        }
        destination.setId(source.getDomainId());
        return destination;
    }

    @Override
    public Paciente mapReverse(PacienteEntity source) {
        return mapReverse(source, new Paciente());
    }

    @Override
    public Paciente mapReverse(PacienteEntity source, Paciente destination) {
		if(Objects.isNull(source)) {
            return null;
		}
        if(Objects.isNull(destination)) {
            return mapReverse(source);
        }
        destination.setId(source.getId());
        return destination;
    }
}