package md.springboot.business.converter;

import com.google.common.base.Converter;
import md.springboot.business.dto.Car;
import md.springboot.repository.entity.CarEntity;
import org.springframework.stereotype.Component;

/**
 * Created by veladii on 25.10.2018
 */
@Component
public class CarConverter extends Converter<CarEntity, Car> {

    @Override
    protected Car doForward(CarEntity entity) {
        Car dto = new Car();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    protected CarEntity doBackward(Car dto) {
        CarEntity entity = new CarEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
