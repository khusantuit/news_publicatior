package com.example.news.services.category;

import com.example.news.criteria.category.CategoryCriteria;
import com.example.news.dto.category.CategoryCreateDto;
import com.example.news.dto.category.CategoryDto;
import com.example.news.dto.category.CategoryUpdateDto;
import com.example.news.services.BaseCrudService;

public interface CategoryService extends BaseCrudService<
        CategoryDto,
        CategoryUpdateDto,
        CategoryCreateDto,
        CategoryCriteria,
        String
        > {
}
