package md.springboot.webservice.controller.impl;

import md.springboot.webservice.controller.GeoLocationTestController;
import org.springframework.stereotype.Controller;

/**
 * Created by veladii on 20.10.2018
 */
@Controller
public class GeoLocationTestControllerImpl implements GeoLocationTestController {
    @Override
    public String retrieve() {
        return "geolocation-management";
    }
}
