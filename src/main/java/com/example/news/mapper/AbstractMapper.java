package com.example.news.mapper;

import com.example.news.dto.BaseDto;
import com.example.news.dto.BaseGenericDto;
import com.example.news.entity.BaseEntity;

import java.util.List;

public interface AbstractMapper<
        E extends BaseEntity,
        D extends BaseGenericDto,
        CD extends BaseDto,
        UD extends BaseGenericDto
        > extends BaseMapper {


    E fromCreateDto(CD createDto);

    E fromUpdateDto(E e, UD updateDto);

    D toDto(E entity);

    List<D> toDto(List<E> entities);
}
