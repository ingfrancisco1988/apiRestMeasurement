package ar.com.repo.APIrest.repository;

import ar.com.repo.APIrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

  User findAllById(Integer userId);

}
