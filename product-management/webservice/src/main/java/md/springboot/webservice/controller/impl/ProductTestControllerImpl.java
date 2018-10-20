package md.springboot.webservice.controller.impl;

import md.springboot.webservice.controller.ProductTestController;
import org.springframework.stereotype.Controller;

/**
 * Created by veladii on 20.10.2018
 */
@Controller
public class ProductTestControllerImpl implements ProductTestController {
    @Override
    public String retrieve() {
        return "product-management";
    }
}
