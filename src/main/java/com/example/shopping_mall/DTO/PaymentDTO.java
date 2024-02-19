package com.example.shopping_mall.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class PaymentDTO {
  private Long paymentId;
  private Long orderId;
  private Date paymentDate;
  private BigDecimal amount;
  private String paymentMethod;
}