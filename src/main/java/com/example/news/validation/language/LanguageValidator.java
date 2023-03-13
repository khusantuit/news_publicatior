package com.example.news.validation.language;

import com.example.news.criteria.language.LanguageCriteria;
import com.example.news.dto.language.LanguageCreateDto;
import com.example.news.dto.language.LanguageUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class LanguageValidator extends AbstractValidator<
            LanguageCreateDto,
            LanguageUpdateDto,
            LanguageCriteria,
            String
        > {
    @Override
    public void validateKey(String s) throws ValidationException {

    }

    @Override
    public void validOnCreate(LanguageCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(LanguageUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(LanguageCriteria criteria) {

    }
}
