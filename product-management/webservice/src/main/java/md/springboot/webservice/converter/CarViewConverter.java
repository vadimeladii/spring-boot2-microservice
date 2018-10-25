package md.springboot.webservice.converter;

import com.google.common.base.Converter;
import md.springboot.business.dto.Car;
import md.springboot.webservice.view.CarView;
import org.springframework.stereotype.Component;

/**
 * Created by veladii on 25.10.2018
 */
@Component
public class CarViewConverter extends Converter<Car, CarView> {
    @Override
    protected CarView doForward(Car dto) {
        CarView view = new CarView();
        view.setId(dto.getId());
        view.setName(dto.getName());
        return view;
    }

    @Override
    protected Car doBackward(CarView view) {
        Car dto = new Car();
        dto.setId(view.getId());
        dto.setName(view.getName());
        return dto;
    }
}
