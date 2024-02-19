package com.example.shopping_mall.DTO;

import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
  private Long id;
  private String name;
  private BigDecimal price;
  private String description;
  private String imageUrl;
}
