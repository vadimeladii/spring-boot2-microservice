package md.springboot.webservice.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by veladii on 27.10.2018
 */
@Getter
@Setter
@NoArgsConstructor
public class UserView implements Serializable {

    private static final long serialVersionUID = 6751972975452198759L;

    private Long id;

    private String email;
}
