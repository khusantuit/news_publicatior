package com.example.news.services.publication;

import com.example.news.criteria.publication.paragraph.ParagraphCriteria;
import com.example.news.dto.publication.paragraph.ParagraphCreateDto;
import com.example.news.dto.publication.paragraph.ParagraphDto;
import com.example.news.dto.publication.paragraph.ParagraphUpdateDto;
import com.example.news.services.BaseCrudService;

public interface ParagraphService extends BaseCrudService<
        ParagraphDto,
        ParagraphCreateDto,
        ParagraphUpdateDto,
        ParagraphCriteria,
        String> {
}
