package md.springboot.webservice.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by veladii on 20.10.2018
 */
@Path("/product")
public interface ProductTestController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String retrieve();
}
