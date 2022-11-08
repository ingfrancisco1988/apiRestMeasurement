package ar.com.repo.APIrest.controllers;


import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.mapper.UserMapper;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private static UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    private List<User> getAllUsers() {
        return userService.list();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{id}")
    public UserDTO findUser(@PathVariable Integer id) {
        return userService.get(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {

        ;
        return ResponseEntity.ok(userService.create(userMapper.toEntity(userDTO))) ;
    }


}
