package ar.com.repo.APIrest.repository;

import ar.com.repo.APIrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  User findAllById(Integer userId);
}
