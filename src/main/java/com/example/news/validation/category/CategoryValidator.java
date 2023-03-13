package com.example.news.validation.category;

import com.example.news.criteria.category.CategoryCriteria;
import com.example.news.dto.category.CategoryCreateDto;
import com.example.news.dto.category.CategoryUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class CategoryValidator extends AbstractValidator<
        CategoryCreateDto,
        CategoryUpdateDto,
        CategoryCriteria,
        String> {
    @Override
    public void validateKey(String id) throws ValidationException {

    }

    @Override
    public void validOnCreate(CategoryCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(CategoryUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(CategoryCriteria criteria) {

    }
}
