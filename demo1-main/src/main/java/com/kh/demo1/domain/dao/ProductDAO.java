package com.kh.demo1.domain.dao;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
  //등록
  Long save(Product product);

  //조회
  Optional<Product> findById(Long productId);

  List<Product> findAll();

  int deleteById(Long productId);
}
