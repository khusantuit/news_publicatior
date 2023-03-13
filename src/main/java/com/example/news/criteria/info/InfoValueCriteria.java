package com.example.news.criteria.info;

import com.example.news.criteria.AbstractCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoValueCriteria extends AbstractCriteria {
    private String languageId;
    private String infoId;
    private String value;
}
