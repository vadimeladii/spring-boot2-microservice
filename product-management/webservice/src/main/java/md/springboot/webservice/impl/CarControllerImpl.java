package md.springboot.webservice.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.CarBusiness;
import md.springboot.webservice.CarController;
import md.springboot.webservice.converter.CarViewConverter;
import org.springframework.stereotype.Controller;

import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

/**
 * Created by veladii on 24.10.2018
 */
@Controller
@RequiredArgsConstructor
public class CarControllerImpl implements CarController {

    private final CarBusiness business;
    private final CarViewConverter converter;

    @Override
    public Response retrieve() {
        return Response
                .ok(
                        business
                                .retrieve()
                                .map(converter::convert)
                                .collect(Collectors.toList()))
                .build();
    }
}
