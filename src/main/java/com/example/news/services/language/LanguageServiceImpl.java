package com.example.news.services.language;

import com.example.news.criteria.language.LanguageCriteria;
import com.example.news.dto.language.LanguageCreateDto;
import com.example.news.dto.language.LanguageDto;
import com.example.news.dto.language.LanguageUpdateDto;
import com.example.news.entity.Language;
import com.example.news.exception.custom.NullElementException;
import com.example.news.mapper.language.LanguageMapper;
import com.example.news.repository.language.LanguageRepository;
import com.example.news.services.AbstractService;
import com.example.news.validation.language.LanguageValidator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class LanguageServiceImpl extends AbstractService<
            LanguageRepository,
            LanguageMapper,
            LanguageValidator
        > implements LanguageService {

    public LanguageServiceImpl(LanguageRepository repository, @Qualifier("languageMapperImpl") LanguageMapper mapper, LanguageValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public LanguageDto get(String id) {
        Optional<Language> optionalLanguage = repository.findByIdAndDeletedFalse(id);
        if(optionalLanguage.isPresent())
            return mapper.toDto(optionalLanguage.get());

        throw new NullElementException("No language with id: " + id);
    }

    @Override
    public List<LanguageDto> getAll(LanguageCriteria criteria) {
        return null;
    }

    @Override
    public String create(LanguageCreateDto dto) {
        validator.validOnCreate(dto);

        Language language = mapper.fromCreateDto(dto);

        return repository.save(language).getId();
    }

    @Override
    public void update(LanguageUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }
}
