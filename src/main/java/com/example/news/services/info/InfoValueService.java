package com.example.news.services.info;

import com.example.news.criteria.info.InfoCriteria;
import com.example.news.criteria.info.InfoValueCriteria;
import com.example.news.dto.info.*;
import com.example.news.services.BaseCrudService;
import org.springframework.stereotype.Service;


public interface InfoValueService  extends BaseCrudService<
        InfoValueDto,
        InfoValueUpdateDto,
        InfoValueCreateDto,
        InfoValueCriteria,
        String> {
}
