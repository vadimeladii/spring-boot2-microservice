package md.springboot.repository;

import md.springboot.repository.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by veladii on 25.10.2018
 */
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
