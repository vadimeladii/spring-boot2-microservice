package md.springboot.business;

import md.springboot.business.dto.Car;

import java.util.stream.Stream;

/**
 * Created by veladii on 24.10.2018
 */
public interface CarBusiness {
    Stream<Car> retrieve();
}
