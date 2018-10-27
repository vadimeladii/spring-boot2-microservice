package md.springboot.business.converter;

import com.google.common.base.Converter;
import md.springboot.business.dto.User;
import md.springboot.repository.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * Created by veladii on 27.10.2018
 */
@Component
public class UserConverter extends Converter<UserEntity, User> {

    @Override
    protected User doForward(UserEntity entity) {
        User dto = new User();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    @Override
    protected UserEntity doBackward(User dto) {
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
