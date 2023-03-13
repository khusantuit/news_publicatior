package com.example.news.services.publication;

import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.mapper.publication.PublicationMapper;
import com.example.news.repository.publication.PublicationRepository;
import com.example.news.services.AbstractService;
import com.example.news.validation.publication.PublicationValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl extends AbstractService<
        PublicationRepository,
        PublicationMapper,
        PublicationValidator> implements PublicationService {
    public PublicationServiceImpl(PublicationRepository repository, PublicationMapper mapper, PublicationValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public PublicationDto get(String s) {
        return null;
    }

    @Override
    public List<PublicationDto> getAll(PublicationCriteria criteria) {
        return null;
    }

    @Override
    public String create(PublicationCreateDto dto) {
        return null;
    }

    @Override
    public void update(PublicationUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }
}
