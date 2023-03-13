package com.example.news.mapper.info;

import com.example.news.dto.info.InfoCreateDto;
import com.example.news.dto.info.InfoDto;
import com.example.news.dto.info.InfoUpdateDto;
import com.example.news.entity.Info;
import com.example.news.mapper.AbstractMapper;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Target;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses = {InfoValueMapper.class},  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface InfoMapper extends AbstractMapper<
            Info,
            InfoDto,
            InfoCreateDto,
            InfoUpdateDto
        > {

    @Override
    Info fromCreateDto(InfoCreateDto createDto);

    Info fromCreateDto(InfoDto dto);

    @Mapping(source = "createDto.key", target = "key")
    @Mapping(source = "parentId", target = "parentId")
    Info fromCreateDto(InfoCreateDto createDto, String parentId);

    @Override
    Info fromUpdateDto(@MappingTarget Info info, InfoUpdateDto updateDto);

    @Override
    InfoDto toDto(Info entity);

    @Override
    List<InfoDto> toDto(List<Info> entities);


}
