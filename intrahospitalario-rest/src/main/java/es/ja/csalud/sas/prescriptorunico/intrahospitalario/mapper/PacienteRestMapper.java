package es.ja.csalud.sas.prescriptorunico.intrahospitalario.mapper;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.criteria.PacienteCriteria;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.dto.PacienteDtoRest;
import es.ja.csalud.sas.framework.domain.mapper.BaseMapper;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PacienteRestMapper extends BaseMapper<PacienteDtoRest, PacienteCriteria>{

	@Override
	public PacienteCriteria mapTo(PacienteDtoRest dto) {
		return mapTo(dto, new PacienteCriteria());
	}

	@Override
	public PacienteCriteria mapTo(PacienteDtoRest dto, PacienteCriteria criteria) {
		criteria = mapTo(dto, criteria);
		
		if (null != criteria) {
			
		}
		
		return criteria;
	}
	
	@Override
	public PacienteDtoRest mapReverse(PacienteCriteria criteria) {
		return mapReverse(criteria, new PacienteDtoRest());
	}

	@Override
	public PacienteDtoRest mapReverse(PacienteCriteria criteria, PacienteDtoRest dto) {
		dto = mapReverse(criteria, dto);
		
		if (null != dto) {
			
		}
		
		return dto;
	}
	
	
}
