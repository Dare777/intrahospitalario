package es.ja.csalud.sas.prescriptorunico.intrahospitalario.interceptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.core.EntityTag;
import jakarta.ws.rs.core.Link;
import jakarta.ws.rs.core.Link.Builder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response.StatusType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CorsRSFilterTest {

    private CorsRSFilter corsRSFilter;
    private ContainerRequestContext requestContext;
    private ContainerResponseContext responseContext;

    @BeforeEach
    void setUp() {
        corsRSFilter = new CorsRSFilter();
        requestContext = mock(ContainerRequestContext.class);
        responseContext = new ContainerResponseContextImpl();
    }

    @Test
    void testFilter() {
        corsRSFilter.filter(requestContext, responseContext);

        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        assertEquals("no-cache, no-store, must-revalidate", headers.getFirst("Cache-Control"));
        assertEquals("no-cache", headers.getFirst("Pragma"));
        assertEquals(0, headers.getFirst("Expires"));
        assertEquals("*", headers.getFirst("Access-Control-Allow-Origin"));
        assertEquals("origin, content-type, accept, authorization, Authorization, version", headers.getFirst("Access-Control-Allow-Headers"));
        assertEquals("true", headers.getFirst("Access-Control-Allow-Credentials"));
        assertEquals("GET, POST, PUT, DELETE, OPTIONS, HEAD", headers.getFirst("Access-Control-Allow-Methods"));
        assertEquals("Location", headers.getFirst("Access-Control-Expose-Headers"));
    }

    @Test
    void testFilterWithExistingHeaders() {
        corsRSFilter.filter(requestContext, responseContext);

        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        assertEquals("no-cache, no-store, must-revalidate", headers.getFirst("Cache-Control"));
        assertEquals("no-cache", headers.getFirst("Pragma"));
        assertEquals(0, headers.getFirst("Expires"));
        assertEquals("*", headers.getFirst("Access-Control-Allow-Origin"));
        assertEquals("origin, content-type, accept, authorization, Authorization, version", headers.getFirst("Access-Control-Allow-Headers"));
        assertEquals("true", headers.getFirst("Access-Control-Allow-Credentials"));
        assertEquals("GET, POST, PUT, DELETE, OPTIONS, HEAD", headers.getFirst("Access-Control-Allow-Methods"));
        assertEquals("Location", headers.getFirst("Access-Control-Expose-Headers"));
    }

    private static class ContainerResponseContextImpl implements ContainerResponseContext {
        private final MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();

        @Override
        public MultivaluedMap<String, Object> getHeaders() {
            return headers;
        }

		@Override
		public int getStatus() {
			return 0;
		}

		@Override
		public void setStatus(int code) {
		}

		@Override
		public StatusType getStatusInfo() {
			return null;
		}

		@Override
		public void setStatusInfo(StatusType statusInfo) {
		}

		@Override
		public MultivaluedMap<String, String> getStringHeaders() {
			return null;
		}

		@Override
		public String getHeaderString(String name) {
			return null;
		}

		@Override
		public Set<String> getAllowedMethods() {
			return null;
		}

		@Override
		public Date getDate() {
			return null;
		}

		@Override
		public Locale getLanguage() {
			return null;
		}

		@Override
		public int getLength() {
			return 0;
		}

		@Override
		public MediaType getMediaType() {
			return null;
		}

		@Override
		public Map<String, NewCookie> getCookies() {
			return null;
		}

		@Override
		public EntityTag getEntityTag() {
			return null;
		}

		@Override
		public Date getLastModified() {
			return null;
		}

		@Override
		public URI getLocation() {
			return null;
		}

		@Override
		public Set<Link> getLinks() {
			return null;
		}

		@Override
		public boolean hasLink(String relation) {
			return false;
		}

		@Override
		public Link getLink(String relation) {
			return null;
		}

		@Override
		public Builder getLinkBuilder(String relation) {
			return null;
		}

		@Override
		public boolean hasEntity() {
			return false;
		}

		@Override
		public Object getEntity() {
			return null;
		}

		@Override
		public Class<?> getEntityClass() {
			return null;
		}

		@Override
		public Type getEntityType() {
			return null;
		}

		@Override
		public void setEntity(Object entity) {
		}

		@Override
		public void setEntity(Object entity, Annotation[] annotations, MediaType mediaType) {
		}

		@Override
		public Annotation[] getEntityAnnotations() {
			return null;
		}

		@Override
		public OutputStream getEntityStream() {
			return null;
		}

		@Override
		public void setEntityStream(OutputStream outputStream) {
		}
    }
}