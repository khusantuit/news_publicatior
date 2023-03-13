package com.example.news.criteria.category;

import com.example.news.criteria.BaseCriteria;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CategoryCriteria implements BaseCriteria {
    private Map<String, String> keyAndValues;
}
