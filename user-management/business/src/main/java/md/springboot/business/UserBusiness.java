package md.springboot.business;

import md.springboot.business.dto.User;

import java.util.stream.Stream;

/**
 * Created by veladii on 27.10.2018
 */
public interface UserBusiness {
    Stream<User> retrieve();
}
