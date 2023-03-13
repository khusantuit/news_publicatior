package com.example.news.validation.publication;

import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class PublicationValidator extends AbstractValidator<
        PublicationCreateDto,
        PublicationUpdateDto,
        PublicationCriteria,
        String> {
    @Override
    public void validateKey(String s) throws ValidationException {

    }

    @Override
    public void validOnCreate(PublicationCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(PublicationUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(PublicationCriteria criteria) {

    }
}
