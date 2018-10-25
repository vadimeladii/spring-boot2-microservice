package md.springboot.business.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by veladii on 25.10.2018
 */
@Setter
@Getter
@NoArgsConstructor
public class Car {

    private Long id;

    @NotNull
    private String name;
}
