package edu.icet.repositery;

import edu.icet.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositery extends JpaRepository<UserEntity , Integer> {
}
