package com.example.news.dto.info;

import com.example.news.dto.BaseGenericDto;
import com.example.news.dto.language.LanguageDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoValueDto extends BaseGenericDto {
    @NotNull
    private String value;


    @JsonProperty(value = "lang")
    private String language;
}
