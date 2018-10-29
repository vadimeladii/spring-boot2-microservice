package md.springboot.webservice.converter;

import com.google.common.base.Converter;
import md.springboot.business.dto.User;
import md.springboot.webservice.view.UserView;
import org.springframework.stereotype.Component;

/**
 * Created by veladii on 27.10.2018
 */
@Component
public class UserViewConverter extends Converter<User, UserView> {

    @Override
    protected UserView doForward(User dto) {
        UserView view = new UserView();
        view.setId(dto.getId());
        view.setEmail(dto.getEmail());
        return view;
    }

    @Override
    protected User doBackward(UserView view) {
        User dto = new User();
        dto.setId(view.getId());
        dto.setEmail(view.getEmail());
        return dto;
    }
}
