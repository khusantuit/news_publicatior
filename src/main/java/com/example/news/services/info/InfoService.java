package com.example.news.services.info;

import com.example.news.criteria.info.InfoCriteria;
import com.example.news.dto.info.InfoCreateDto;
import com.example.news.dto.info.InfoDto;
import com.example.news.dto.info.InfoUpdateDto;
import com.example.news.services.BaseCrudService;

public interface InfoService extends BaseCrudService<
            InfoDto,
            InfoUpdateDto,
            InfoCreateDto,
            InfoCriteria,
            String
        > {
}
