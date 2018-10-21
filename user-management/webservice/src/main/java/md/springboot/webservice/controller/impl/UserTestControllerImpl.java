package md.springboot.webservice.controller.impl;

import md.springboot.webservice.controller.UserTestController;
import org.springframework.stereotype.Controller;

/**
 * Created by veladii on 21.10.2018
 */
@Controller
public class UserTestControllerImpl implements UserTestController {
    @Override
    public String retrieve() {
        return "user-management";
    }
}
