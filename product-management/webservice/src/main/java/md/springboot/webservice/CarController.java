package md.springboot.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by veladii on 24.10.2018
 */
@Path("/car")
public interface CarController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response retrieve();
}
