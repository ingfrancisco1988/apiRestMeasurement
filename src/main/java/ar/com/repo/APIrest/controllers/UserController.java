package ar.com.repo.APIrest.controllers;


import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.mapper.UserMapper;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private static UserServiceImpl userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserServiceImpl userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping(path = "/")
    private List<User> getAllUsers() {
        return userService.all();
    }

    @GetMapping("/{id}")
    public UserDTO findUser(@PathVariable Integer id) {
        return userService.get(id);
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.create(userMapper.toEntity(userDTO))) ;
    }

    @PutMapping("/")
    public ResponseEntity<User> updateUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.update(userMapper.toEntity(userDTO))) ;
    }

    @DeleteMapping("/{userID}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userID) {
        userService.delete(userID);
       return ResponseEntity.ok("The user has been Delete");
    }

}
