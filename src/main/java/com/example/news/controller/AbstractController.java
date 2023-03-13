package com.example.news.controller;

import com.example.news.criteria.BaseCriteria;
import com.example.news.dto.BaseDto;
import com.example.news.dto.BaseGenericDto;
import com.example.news.dto.data.DataDto;
import com.example.news.services.BaseService;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractController<
        S extends BaseService,
        D extends BaseGenericDto,
        CD extends BaseDto,
        UD extends BaseGenericDto,
        ID extends Serializable,
        C extends BaseCriteria> {

    protected S service;
    protected final static String API = "/api";
    protected final static String VERSION = "/v1";
    public final static String PATH = API + VERSION;

    public AbstractController(S service) {
        this.service = service;
    }

    protected abstract ResponseEntity<DataDto<ID>> create(CD dto);

    protected abstract ResponseEntity<DataDto<String>> delete(ID id);

    protected abstract ResponseEntity<DataDto<String>> update(UD dto, ID id);

    protected abstract ResponseEntity<DataDto<D>> get(ID id);

    protected abstract ResponseEntity<DataDto<List<D>>> getAll(C criteria);

}
