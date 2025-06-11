package com.kamsspace.ecommerceapp.service;

import com.kamsspace.ecommerceapp.payload.ProductDTO;
import com.kamsspace.ecommerceapp.payload.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(ProductDTO product, Long categoryId);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductsByKeyword(String keyword);

    ProductDTO updateProduct(ProductDTO product, Long productId);

    ProductDTO deleteProduct(Long productId);
}
