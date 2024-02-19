package com.example.shopping_mall.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class OrderDTO {
  private Long orderId;
  private Long userId;
  private Date orderDate;
  private BigDecimal totalAmount;
  private String status;
  private String paymentMethod;
}