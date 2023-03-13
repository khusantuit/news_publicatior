package com.example.news.validation.publication.paragraph;

import com.example.news.criteria.publication.paragraph.ParagraphCriteria;
import com.example.news.dto.publication.paragraph.ParagraphCreateDto;
import com.example.news.dto.publication.paragraph.ParagraphUpdateDto;
import com.example.news.validation.AbstractValidator;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ParagraphValidator extends AbstractValidator<
        ParagraphCreateDto,
        ParagraphUpdateDto,
        ParagraphCriteria,
        String> {
    @Override
    public void validateKey(String s) throws ValidationException {

    }

    @Override
    public void validOnCreate(ParagraphCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ParagraphUpdateDto updateDto) throws ValidationException {

    }

    @Override
    public void validCriteria(ParagraphCriteria criteria) {

    }
}
