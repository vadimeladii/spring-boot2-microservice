package md.springboot.webservice.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.UserBusiness;
import md.springboot.webservice.UserController;
import md.springboot.webservice.converter.UserViewConverter;
import org.springframework.stereotype.Controller;

import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

/**
 * Created by veladii on 21.10.2018
 */
@Controller
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserBusiness business;
    private final UserViewConverter converter;

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
