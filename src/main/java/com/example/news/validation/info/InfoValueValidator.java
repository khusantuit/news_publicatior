package com.example.news.validation.info;

import com.example.news.criteria.info.InfoValueCriteria;
import com.example.news.dto.info.InfoValueCreateDto;
import com.example.news.dto.info.InfoValueUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class InfoValueValidator extends AbstractValidator<
        InfoValueCreateDto,
        InfoValueUpdateDto,
        InfoValueCriteria,
        String> {
    @Override
    public void validateKey(String s) throws ValidationException {

    }

    @Override
    public void validOnCreate(InfoValueCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(InfoValueUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(InfoValueCriteria criteria) {

    }
}
