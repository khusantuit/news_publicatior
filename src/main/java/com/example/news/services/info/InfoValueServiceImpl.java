package com.example.news.services.info;

import com.example.news.criteria.info.InfoValueCriteria;
import com.example.news.dto.info.InfoValueCreateDto;
import com.example.news.dto.info.InfoValueDto;
import com.example.news.dto.info.InfoValueUpdateDto;
import com.example.news.entity.InfoValue;
import com.example.news.entity.Language;
import com.example.news.mapper.info.InfoMapper;
import com.example.news.mapper.info.InfoValueMapper;
import com.example.news.mapper.language.LanguageMapper;
import com.example.news.repository.info.InfoValueRepository;
import com.example.news.services.AbstractService;
import com.example.news.services.language.LanguageServiceImpl;
import com.example.news.validation.info.InfoValueValidator;
import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoValueServiceImpl extends AbstractService<
            InfoValueRepository,
            InfoValueMapper,
            InfoValueValidator
        > implements InfoValueService {

    public InfoValueServiceImpl(InfoValueRepository repository,  @Qualifier("infoValueMapperImpl") InfoValueMapper mapper, InfoValueValidator validator) {
        super(repository, mapper, validator);
    }

    @Autowired
    LanguageServiceImpl languageService;
    @Autowired
    InfoServiceImpl infoService;
    @Autowired
    InfoMapper infoMapper;
    @Autowired
    LanguageMapper languageMapper;

    @Override
    public InfoValueDto get(String s) {
        return null;
    }

    @Override
    public List<InfoValueDto> getAll(InfoValueCriteria criteria) {
        return null;
    }

    @Override
    public String create(InfoValueCreateDto dto) {
        validator.validOnCreate(dto);
        InfoValue infoValue = mapper.fromCreateDto(dto);

        infoValue.setInfo(infoMapper.fromCreateDto(infoService.get(dto.getInfoId())));
        infoValue.setLanguage(languageMapper.fromCreateDto(languageService.get(dto.getLanguageId())));

        return repository.save(infoValue).getId();
    }

    @Override
    public void update(InfoValueUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }

    public List<InfoValueDto> getAllByInfoId(String infoId) {
        List<InfoValue> infoValues = repository.findAllByInfoIdAndDeletedFalse(infoId);

        if(infoValues.size() == 0)
            return null;

        return mapper.toDto(infoValues);
    }
}
