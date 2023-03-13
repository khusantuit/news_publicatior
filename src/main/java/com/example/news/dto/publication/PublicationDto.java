package com.example.news.dto.publication;

import com.example.news.dto.BaseGenericDto;
import com.example.news.dto.publication.paragraph.ParagraphDto;
import com.example.news.entity.Paragraph;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PublicationDto extends BaseGenericDto {
    private Long countViews;

    private List<ParagraphDto> paragraphs;
}
