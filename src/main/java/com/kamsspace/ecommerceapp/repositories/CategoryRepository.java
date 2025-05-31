package com.kamsspace.ecommerceapp.repositories;

import com.kamsspace.ecommerceapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryName(String categoryName);
}
