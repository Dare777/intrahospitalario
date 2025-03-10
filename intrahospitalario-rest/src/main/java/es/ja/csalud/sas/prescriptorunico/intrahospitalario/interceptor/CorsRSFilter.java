package es.ja.csalud.sas.prescriptorunico.intrahospitalario.interceptor;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CorsRSFilter implements ContainerResponseFilter {
    /**
     * CORS
     */
    public CorsRSFilter() {
        //Se necesita un constructor vacío
    }

    /**
     * Escribe cabeceras de Access-Control-Allow-Origin
     *
     * @param request  object
     * @param response object
     */
    @Override
    public final void filter(final ContainerRequestContext request, final ContainerResponseContext response){
        // No cacheable headers
        // HTTP 1.1.
        response.getHeaders().add("Cache-Control", "no-cache, no-store, must-revalidate");
        // HTTP 1.0.
        response.getHeaders().add("Pragma", "no-cache");
        // Proxies.
        response.getHeaders().add("Expires", 0);
        // Cors headers
        response.getHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, Authorization, version");
        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
        response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        response.getHeaders().add("Access-Control-Expose-Headers", "Location");
    }
}
