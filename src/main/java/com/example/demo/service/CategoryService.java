package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategory();

    CategoryDTO insertOrUpdate(CategoryDTO categoryDTO);

    CategoryDTO getCategoryById(Long categoryId);

}
