package com.example.news.mapper.category;

import com.example.news.dto.category.CategoryCreateDto;
import com.example.news.dto.category.CategoryDto;
import com.example.news.dto.category.CategoryUpdateDto;
import com.example.news.entity.Category;
import com.example.news.mapper.AbstractMapper;
import com.example.news.mapper.info.InfoMapper;
import com.example.news.mapper.info.InfoValueMapper;
import com.example.news.mapper.language.LanguageMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses = {InfoMapper.class, InfoValueMapper.class, LanguageMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryMapper extends AbstractMapper<
        Category,
        CategoryDto,
        CategoryCreateDto,
        CategoryUpdateDto> {

    @Override
    Category fromCreateDto(CategoryCreateDto createDto);

    @Override
    Category fromUpdateDto(@MappingTarget Category category, CategoryUpdateDto updateDto);

    @Override
    CategoryDto toDto(Category entity);

    @Override
    List<CategoryDto> toDto(List<Category> entities);

//    default Category fromCreateDtoToEntity(CategoryCreateDto createDto) {
//
//    }

}
