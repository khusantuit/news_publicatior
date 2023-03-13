package com.example.news.criteria.publication;

import com.example.news.criteria.AbstractCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicationCriteria extends AbstractCriteria {
    private String categoryId;
}
