package com.example.news.mapper.publication;

import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.entity.Publication;
import com.example.news.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PublicationMapper extends AbstractMapper<
        Publication,
        PublicationDto,
        PublicationCreateDto,
        PublicationUpdateDto> {
    @Override
    Publication fromCreateDto(PublicationCreateDto createDto);

    @Override
    Publication fromUpdateDto(@MappingTarget Publication publication, PublicationUpdateDto updateDto);

    @Override
    PublicationDto toDto(Publication entity);

    @Override
    List<PublicationDto> toDto(List<Publication> entities);
}
