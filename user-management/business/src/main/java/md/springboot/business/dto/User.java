package md.springboot.business.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by veladii on 27.10.2018
 */
@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;

    @NotNull
    private String email;
}
