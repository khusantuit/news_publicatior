package com.example.news_project.criteria.publication;

import com.example.news_project.criteria.AbstractCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicationCriteria extends AbstractCriteria {
    private String categoryId;
    public PublicationCriteria(Integer size, Integer page, String categoryId) {
        super(size, page);
        this.categoryId = categoryId;
    }
}