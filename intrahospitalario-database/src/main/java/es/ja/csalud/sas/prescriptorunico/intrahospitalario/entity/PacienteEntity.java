package es.ja.csalud.sas.prescriptorunico.intrahospitalario.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import es.ja.csalud.sas.framework.infraestructura.database.jpa.repository.enitity.JpaEntity;

/**
 * The type Paciente entity.
 */
@Entity
@Table(name = "PACIENTE")
@SequenceGenerator(name = "PACIENTE_SEQ", allocationSize = 1)
public class PacienteEntity extends JpaEntity<Long> implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /**
     * The Entity id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PACIENTE_SEQ")
    @Column(name = "PACIENTEID", nullable = false)
    protected Long id;	
	
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long newEntityId) {
        this.id = newEntityId;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PacienteEntity other = (PacienteEntity) obj;
		return Objects.equals(id, other.id);
	}    
}