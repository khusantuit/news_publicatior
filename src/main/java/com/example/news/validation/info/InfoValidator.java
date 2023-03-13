package com.example.news.validation.info;

import com.example.news.criteria.info.InfoCriteria;
import com.example.news.dto.info.InfoCreateDto;
import com.example.news.dto.info.InfoUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class InfoValidator extends AbstractValidator<
            InfoCreateDto,
            InfoUpdateDto,
            InfoCriteria,
            String
        > {


    @Override
    public void validateKey(String s) throws ValidationException {

    }

    @Override
    public void validOnCreate(InfoCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(InfoUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(InfoCriteria criteria) {

    }
}
