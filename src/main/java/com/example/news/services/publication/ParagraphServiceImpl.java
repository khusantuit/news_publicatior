package com.example.news.services.publication;

import com.example.news.criteria.publication.paragraph.ParagraphCriteria;
import com.example.news.dto.publication.paragraph.ParagraphCreateDto;
import com.example.news.dto.publication.paragraph.ParagraphDto;
import com.example.news.dto.publication.paragraph.ParagraphUpdateDto;
import com.example.news.mapper.publication.paragraph.ParagraphMapper;
import com.example.news.repository.publication.ParagraphRepository;
import com.example.news.services.AbstractService;
import com.example.news.validation.publication.paragraph.ParagraphValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParagraphServiceImpl extends AbstractService<
        ParagraphRepository,
        ParagraphMapper,
        ParagraphValidator> implements ParagraphService{
    public ParagraphServiceImpl(ParagraphRepository repository, @Qualifier("ParagraphMapperImpl") ParagraphMapper mapper, ParagraphValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public ParagraphDto get(String s) {
        return null;
    }

    @Override
    public List<ParagraphDto> getAll(ParagraphCriteria criteria) {
        return null;
    }

    @Override
    public String create(ParagraphCreateDto dto) {
        return null;
    }

    @Override
    public void update(ParagraphUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }
}
