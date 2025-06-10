package com.kamsspace.ecommerceapp.service;

import com.kamsspace.ecommerceapp.model.Product;
import com.kamsspace.ecommerceapp.payload.ProductDTO;
import com.kamsspace.ecommerceapp.payload.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(Product product, Long categoryId);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductsByKeyword(String keyword);

    ProductDTO updateProduct(Product product, Long productId);
}
