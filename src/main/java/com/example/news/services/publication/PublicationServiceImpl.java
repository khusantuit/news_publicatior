package com.example.news.services.publication;

import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.entity.Publication;
import com.example.news.exception.custom.NullElementException;
import com.example.news.mapper.publication.PublicationMapper;
import com.example.news.repository.publication.PublicationRepository;
import com.example.news.services.AbstractService;
import com.example.news.validation.publication.PublicationValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationServiceImpl extends AbstractService<
        PublicationRepository,
        PublicationMapper,
        PublicationValidator> implements PublicationService {
    public PublicationServiceImpl(PublicationRepository repository, PublicationMapper mapper, PublicationValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public PublicationDto get(String entityId) {
        validator.validateKey(entityId);

        Optional<Publication> publicationOptional = repository.findByIdAndDeletedFalse(entityId);

        if (publicationOptional.isPresent())
            return mapper.toDto(publicationOptional.get());

        throw new NullElementException("No publication with id: " + entityId);
    }

    @Override
    public List<PublicationDto> getAll(PublicationCriteria criteria) {
        validator.validateKey(null);

//        return repository.findAllByNameContainingIgnoreCaseAndDeletedFalse(c);
    }

    @Override
    public String create(PublicationCreateDto dto) {
        validator.validOnCreate(dto);

        Publication publication = mapper.fromCreateDto(dto);

        return repository.save(publication).getId();
    }

    @Override
    public void update(PublicationUpdateDto dto) {
        validator.validOnUpdate(dto);

//        repository.findByIdAndDeletedFalse(dto.getId())
    }

    @Override
    public void delete(String entityId) {

    }
}
