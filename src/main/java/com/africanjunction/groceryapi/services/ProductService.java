package com.africanjunction.groceryapi.services;

import com.africanjunction.groceryapi.models.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    void deleteProduct(Long id);
}
