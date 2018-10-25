package md.springboot.webservice.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by veladii on 25.10.2018
 */
@Getter
@Setter
@NoArgsConstructor
public class CarView implements Serializable {

    private static final long serialVersionUID = -5531538332254832362L;

    private Long id;

    private String name;
}
