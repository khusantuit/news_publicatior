package com.example.news.services.publication;

import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.services.BaseCrudService;

public interface PublicationService extends BaseCrudService<
        PublicationDto,
        PublicationCreateDto,
        PublicationUpdateDto,
        PublicationCriteria,
        String> {
}
