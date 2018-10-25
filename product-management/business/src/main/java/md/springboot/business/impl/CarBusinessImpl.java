package md.springboot.business.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.CarBusiness;
import md.springboot.business.converter.CarConverter;
import md.springboot.business.dto.Car;
import md.springboot.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Created by veladii on 24.10.2018
 */
@Service
@RequiredArgsConstructor
public class CarBusinessImpl implements CarBusiness {

    private final CarRepository repository;
    private final CarConverter converter;

    @Override
    public Stream<Car> retrieve() {
        return repository.findAll().stream().map(converter::convert);
    }
}
