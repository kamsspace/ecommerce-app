package com.kamsspace.ecommerceapp.service;

import com.kamsspace.ecommerceapp.model.Category;
import com.kamsspace.ecommerceapp.payload.CategoryDTO;
import com.kamsspace.ecommerceapp.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
