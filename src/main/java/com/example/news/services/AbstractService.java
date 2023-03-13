package com.example.news.services;

import com.example.news.mapper.BaseMapper;
import com.example.news.repository.BaseRepository;
import com.example.news.validation.BaseValidator;

public class AbstractService<
        R extends BaseRepository,
        M extends BaseMapper,
        V extends BaseValidator> {

    protected final R repository;
    protected final M mapper;
    protected final V validator;

    public AbstractService(R repository, M mapper, V validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }
}
