package com.example.news.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class BaseGenericDto implements BaseDto{
    protected String id;

    public BaseGenericDto(String id) {
        this.id = id;
    }
}
