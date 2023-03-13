package com.example.news.mapper.language;

import com.example.news.dto.info.InfoDto;
import com.example.news.dto.language.LanguageCreateDto;
import com.example.news.dto.language.LanguageDto;
import com.example.news.dto.language.LanguageUpdateDto;
import com.example.news.entity.Info;
import com.example.news.entity.Language;
import com.example.news.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface LanguageMapper extends AbstractMapper<
        Language,
        LanguageDto,
        LanguageCreateDto,
        LanguageUpdateDto
        > {

    @Override
    Language fromCreateDto(LanguageCreateDto createDto);
    Language fromCreateDto(LanguageDto dto);
    @Override
    Language fromUpdateDto(@MappingTarget Language language, LanguageUpdateDto updateDto);

    @Override
    LanguageDto toDto(Language entity);

    @Override
    List<LanguageDto> toDto(List<Language> entities);
}
