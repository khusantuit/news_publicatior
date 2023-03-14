package com.example.news.criteria.publication;

import com.example.news.criteria.AbstractCriteria;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class PublicationCriteria extends AbstractCriteria {
    private String categoryId;

    private Long countViews;

    private Map<String, String> keyAndValues;
}
