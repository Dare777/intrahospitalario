package es.ja.csalud.sas.prescriptorunico.intrahospitalario.dto;

import jakarta.ws.rs.QueryParam;

public class PacienteDtoRest {
	
	@QueryParam("id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
}