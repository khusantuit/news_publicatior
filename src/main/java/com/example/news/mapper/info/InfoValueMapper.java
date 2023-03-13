package com.example.news.mapper.info;

import com.example.news.dto.info.InfoValueCreateDto;
import com.example.news.dto.info.InfoValueDto;
import com.example.news.dto.info.InfoValueUpdateDto;
import com.example.news.entity.InfoValue;
import com.example.news.mapper.AbstractMapper;
import com.example.news.mapper.language.LanguageMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses = {InfoMapper.class, LanguageMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface InfoValueMapper extends AbstractMapper<
        InfoValue,
        InfoValueDto,
        InfoValueCreateDto,
        InfoValueUpdateDto
        > {
    @Override
    InfoValue fromCreateDto(InfoValueCreateDto createDto);

    @Override
    InfoValue fromUpdateDto(@MappingTarget InfoValue infoValue, InfoValueUpdateDto updateDto);

    @Override
    @Mapping(source = "entity.language.name", target = "language")
    InfoValueDto toDto(InfoValue entity);

    @Override
    @Mapping(source = "entity.language.name", target = "language")
    List<InfoValueDto> toDto(List<InfoValue> entities);

}
