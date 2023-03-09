package com.example.news_project.services;

import com.example.news_project.mapper.BaseMapper;
import com.example.news_project.repository.BaseRepository;
import com.example.news_project.validation.BaseValidation;

public class AbstractService<
        R extends BaseRepository,
        M extends BaseMapper,
        V extends BaseValidation> {

    protected final R repository;
    protected final M mapper;
    protected final V validator;

    public AbstractService(R repository, M mapper, V validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }
}
