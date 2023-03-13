package com.example.news.services;

import com.example.news.criteria.BaseCriteria;
import com.example.news.dto.BaseDto;
import com.example.news.dto.BaseGenericDto;

import java.io.Serializable;
import java.util.List;

public interface BaseCrudService<
        D extends BaseGenericDto,
        UD extends BaseGenericDto,
        CD extends BaseDto,
        C extends BaseCriteria,
        ID extends Serializable> extends BaseService{

    D get(ID id);

    List<D> getAll(C criteria);

    String create(CD dto);

    void update(UD dto);

    void delete(ID id);
}
