package com.example.shopping_mall.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
  private Long userId;
  private String username;
  private String password;
  private String email;
}
