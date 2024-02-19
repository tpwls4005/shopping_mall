package com.example.shopping_mall.Service;


import com.example.shopping_mall.DTO.UserDTO;
import com.example.shopping_mall.Entity.User;
import com.example.shopping_mall.Repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public UserDTO getUserById(Long userId) {
    User user = userRepository.findById(userId)
        .orElseThrow(() -> new RuntimeException("User not found"));
    UserDTO userDTO = new UserDTO();
    BeanUtils.copyProperties(user, userDTO);
    return userDTO;
  }

  public List<UserDTO> getAllUsers() {
    List<User> userList = userRepository.findAll();
    return userList.stream()
        .map(user -> {
          UserDTO userDTO = new UserDTO();
          BeanUtils.copyProperties(user, userDTO);
          return userDTO;
        })
        .collect(Collectors.toList());
  }

  public UserDTO createUser(UserDTO userDTO) {
    User user = new User();
    BeanUtils.copyProperties(userDTO, user);
    user = userRepository.save(user);
    BeanUtils.copyProperties(user, userDTO);
    return userDTO;
  }

  public UserDTO updateUser(Long userId, UserDTO userDTO) {
    User user = userRepository.findById(userId)
        .orElseThrow(() -> new RuntimeException("User not found"));
    BeanUtils.copyProperties(userDTO, user);
    user = userRepository.save(user);
    BeanUtils.copyProperties(user, userDTO);
    return userDTO;
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
