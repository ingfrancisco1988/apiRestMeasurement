package ar.com.repo.APIrest.service;


import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.mapper.UserMapper;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


  @Service
  public class UserService {
    private final UserMapper userMapper;
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository, UserMapper userMapper) {
      this.repository = repository;
      this.userMapper = userMapper;
    }

    public UserDTO get(Integer userId) {
      return userMapper.toDto(repository.findAllById(userId))  ;
    }

    public List<User> list() {
      List<User> listas = new ArrayList<User>();
       repository.findAll().forEach(listas::add);
      return (listas);
    }

    public User create(User user) {
      return repository.save(user);
    }

  }


