package com.example.shopping_mall.Controller;

import com.example.shopping_mall.DTO.UserDTO;
import com.example.shopping_mall.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<UserDTO> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{userId}")
  public UserDTO getUserById(@PathVariable Long userId) {
    return userService.getUserById(userId);
  }

  @PostMapping
  public UserDTO createUser(@RequestBody UserDTO userDTO) {
    return userService.createUser(userDTO);
  }

  @PutMapping("/{userId}")
  public UserDTO updateUser(@PathVariable Long userId, @RequestBody UserDTO userDTO) {
    return userService.updateUser(userId, userDTO);
  }

  @DeleteMapping("/{userId}")
  public void deleteUser(@PathVariable Long userId) {
    userService.deleteUser(userId);
  }
}