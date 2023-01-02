package ar.com.repo.APIrest.service;

import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.model.User;

import java.util.List;

public interface UserService {

    UserDTO get(Integer userId);

    List<User> all();

    User create(User user);

    User update(User user);

    void delete(Integer user);
}
