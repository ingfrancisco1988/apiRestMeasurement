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
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository, UserMapper userMapper) {
        this.repository = repository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO get(Integer userId) {
        return userMapper.toDto(repository.findAllById(userId));
    }

    @Override
    public List<User> all() {
        List<User> listas = new ArrayList<>();
        repository.findAll().forEach(listas::add);
        return (listas);
    }

    @Override
    public User create(User user){ return repository.save(user); }


    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(Integer userID) {
    repository.deleteById(userID);
    }
}


