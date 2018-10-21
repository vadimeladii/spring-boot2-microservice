package md.springboot.webservice.config.jersey;

import md.springboot.webservice.controller.TrackingTestController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by veladii on 21.10.2018
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(TrackingTestController.class);
    }
}
