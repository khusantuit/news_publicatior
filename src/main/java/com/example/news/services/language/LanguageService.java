package com.example.news.services.language;

import com.example.news.criteria.language.LanguageCriteria;
import com.example.news.dto.language.LanguageCreateDto;
import com.example.news.dto.language.LanguageDto;
import com.example.news.dto.language.LanguageUpdateDto;
import com.example.news.services.BaseCrudService;

public interface LanguageService extends BaseCrudService<
            LanguageDto,
            LanguageUpdateDto,
            LanguageCreateDto,
            LanguageCriteria,
            String
        > {
}
