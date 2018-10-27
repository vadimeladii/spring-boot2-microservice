package md.springboot.repository;

import md.springboot.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by veladii on 27.10.2018
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
