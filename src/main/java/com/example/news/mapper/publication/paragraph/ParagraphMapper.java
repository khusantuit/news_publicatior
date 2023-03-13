package com.example.news.mapper.publication.paragraph;

import com.example.news.dto.publication.paragraph.ParagraphCreateDto;
import com.example.news.dto.publication.paragraph.ParagraphDto;
import com.example.news.dto.publication.paragraph.ParagraphUpdateDto;
import com.example.news.entity.Paragraph;
import com.example.news.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ParagraphMapper extends AbstractMapper<
        Paragraph,
        ParagraphDto,
        ParagraphCreateDto,
        ParagraphUpdateDto> {
    @Override
    Paragraph fromCreateDto(ParagraphCreateDto createDto);

    @Override
    Paragraph fromUpdateDto(@MappingTarget Paragraph paragraph, ParagraphUpdateDto updateDto);

    @Override
    ParagraphDto toDto(Paragraph entity);

    @Override
    List<ParagraphDto> toDto(List<Paragraph> entities);
}
