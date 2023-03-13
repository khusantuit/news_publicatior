package com.example.news.services.info;

import com.example.news.criteria.info.InfoCriteria;
import com.example.news.dto.info.InfoCreateDto;
import com.example.news.dto.info.InfoDto;
import com.example.news.dto.info.InfoUpdateDto;
import com.example.news.entity.Category;
import com.example.news.entity.Info;
import com.example.news.mapper.info.InfoMapper;
import com.example.news.repository.info.InfoRepository;
import com.example.news.services.AbstractService;
import com.example.news.validation.info.InfoValidator;
import jakarta.transaction.Transactional;
import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class InfoServiceImpl extends AbstractService<
            InfoRepository,
            InfoMapper,
            InfoValidator
        > implements InfoService {
    @Autowired
    InfoValueServiceImpl infoValueService;

    public InfoServiceImpl(InfoRepository repository, @Qualifier("infoMapperImpl") InfoMapper mapper, InfoValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public InfoDto get(String id) {
        validator.validateKey(id);

        Optional<Info> categoryOptional = repository.findByIdAndDeletedFalse(id);
        if(categoryOptional.isPresent()) {
            Info info = categoryOptional.get();

            return mapper.toDto(info);
        }
        return null;
    }


    @Override
    public List<InfoDto> getAll(InfoCriteria criteria) {
        return null;
    }

    @Override
    public String create(InfoCreateDto dto) {
        return null;
    }

    @Override
    public void update(InfoUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }
    public String create(InfoCreateDto dto, String parentId) {
        Info info = mapper.fromCreateDto(dto, parentId);

        return repository.save(info).getKey();
    }

    public List<InfoDto> getAllByParentId(String categoryId) {
//        validator.validateKey(id);

        List<Info> infoList = repository.findAllByParentIdAndDeletedFalse(categoryId);

        List<InfoDto> infoDtoList = mapper.toDto(infoList);

        for (InfoDto infoDto : infoDtoList) {
            infoDto.setValues(infoValueService.getAllByInfoId(infoDto.getId()));
        }

        return infoDtoList;
    }
}
