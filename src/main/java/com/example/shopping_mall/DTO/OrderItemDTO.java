package com.example.shopping_mall.DTO;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItemDTO {
  private Long orderItemId;
  private Long orderId;
  private Long productId;
  private int quantity;
  private BigDecimal unitPrice;
}