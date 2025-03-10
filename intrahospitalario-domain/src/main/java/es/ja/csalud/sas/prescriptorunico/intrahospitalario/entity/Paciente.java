package es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity;

import es.ja.csalud.sas.framework.domain.Domain;
import java.util.*;

public class Paciente extends Domain<Long> {

    private Long id;
    
    @Override
    public Long getDomainId() {
        return id;
    }

    @Override
    public void setDomainId(Long newDomainId) {
        this.id = newDomainId;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { 
        	return true;
        }
        if (!super.equals(o)) {
        	return false;
        }
        if (o == null || getClass() != o.getClass()) { 
        	return false;
        }
        
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id);
    }
}