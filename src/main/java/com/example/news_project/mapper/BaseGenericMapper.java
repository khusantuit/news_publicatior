package com.example.news_project.mapper;

import com.example.news_project.dto.BaseDto;
import com.example.news_project.dto.BaseGenericDto;
import com.example.news_project.entity.BaseEntity;

import java.util.List;

public interface BaseGenericMapper<
        E extends BaseEntity,
        D extends BaseGenericDto,
        CD extends BaseDto,
        UD extends BaseGenericDto
        > extends BaseMapper {


    E fromCreateDto(CD dto);

    E fromUpdateDto(E e, UD dto);

    D toDto(E entity);

    List<D> toDto(List<E> entities);
}
