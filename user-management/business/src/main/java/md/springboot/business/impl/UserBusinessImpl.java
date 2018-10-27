package md.springboot.business.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.UserBusiness;
import md.springboot.business.converter.UserConverter;
import md.springboot.business.dto.User;
import md.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Created by veladii on 27.10.2018
 */
@Service
@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {

    private final UserRepository repository;
    private final UserConverter converter;

    @Override
    public Stream<User> retrieve() {
        return repository.findAll().stream().map(converter::convert);
    }
}
