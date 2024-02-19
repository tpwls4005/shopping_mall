package com.example.shopping_mall.utill;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCriteria {
  private String keyword;
  private Double minPrice;
  private Double maxPrice;
  // 추가적인 검색 조건을 필요에 따라 정의할 수 있습니다.
}