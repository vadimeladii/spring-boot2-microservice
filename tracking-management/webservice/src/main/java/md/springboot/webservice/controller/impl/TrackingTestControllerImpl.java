package md.springboot.webservice.controller.impl;

import md.springboot.webservice.controller.TrackingTestController;
import org.springframework.stereotype.Controller;

/**
 * Created by veladii on 21.10.2018
 */
@Controller
public class TrackingTestControllerImpl implements TrackingTestController {
    @Override
    public String retrieve() {
        return "tracking-management";
    }
}
