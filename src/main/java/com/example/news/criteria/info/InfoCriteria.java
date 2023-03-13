package com.example.news.criteria.info;

import com.example.news.criteria.AbstractCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoCriteria extends AbstractCriteria {
    private String key;
    private String parentId;
}
