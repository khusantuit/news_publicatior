package com.example.news_project.services;

import com.example.news_project.criteria.BaseCriteria;
import com.example.news_project.dto.BaseDto;
import com.example.news_project.dto.BaseGenericDto;

import java.io.Serializable;
import java.util.List;

public interface BaseCrudService<
        D extends BaseGenericDto,
        UD extends BaseGenericDto,
        CD extends BaseDto,
        C extends BaseCriteria,
        K extends Serializable> extends BaseService{

    D get(K id);

    List<D> getAll(C criteria);

    String create(CD dto);

    void update(UD dto);

    void delete(K id);
}
