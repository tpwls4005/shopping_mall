package com.example.shopping_mall.Service;

import com.example.shopping_mall.Entity.Product;
import com.example.shopping_mall.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Product getProductById(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }
  public Product updateProduct(Long id, Product updatedProduct) {
    Product existingProduct = productRepository.findById(id).orElse(null);
    if (existingProduct == null) {
      return null;
    }
    existingProduct.setName(updatedProduct.getName());
    existingProduct.setPrice(updatedProduct.getPrice());
    existingProduct.setDescription(updatedProduct.getDescription());
    existingProduct.setImageUrl(updatedProduct.getImageUrl());
    return productRepository.save(existingProduct);
  }

}
