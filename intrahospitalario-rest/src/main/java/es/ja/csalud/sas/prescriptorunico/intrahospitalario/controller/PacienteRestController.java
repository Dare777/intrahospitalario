package es.ja.csalud.sas.prescriptorunico.intrahospitalario.controller;

import es.ja.csalud.sas.prescriptorunico.intrahospitalario.use_case.PacienteSearchService;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.mapper.PacienteRestMapper;
import es.ja.csalud.sas.prescriptorunico.intrahospitalario.dto.PacienteDtoRest;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.BeanParam;

/**
 * Clase PacienteRest api rest *
 * @author nttdata
 */
@RequestScoped
@Path("paciente")
public class PacienteRestController {
    
    private PacienteSearchService searchServicePaciente;
    private PacienteRestMapper restMapper;

    @Inject
    public void init(final PacienteSearchService searchPaciente, final PacienteRestMapper restMapper) {
        this.searchServicePaciente = searchPaciente;

    }

    @GET
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchPacienteByCriteria(@BeanParam PacienteDtoRest dto) {
        
    	// return Response
    	// 		.status(Response.Status.OK)
    	// 		.entity(this.searchServicePaciente.findByCriteria(this.restMapper.mapTo(dto)))
    	// 		.build();

        return Response.ok(System.getProperties()).status(Response.Status.OK).build();
        
    }
}