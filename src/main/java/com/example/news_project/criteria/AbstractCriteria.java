package com.example.news_project.criteria;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AbstractCriteria implements BaseCriteria {

    private int size;
    private int page;

    public AbstractCriteria(int size, int page) {
        this.size = size;
        this.page = page;
    }

    public AbstractCriteria(int page) {
        this(5, page);
    }
}
