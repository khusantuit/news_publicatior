package com.example.news.dto.language;

import com.example.news.dto.BaseGenericDto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageDto extends BaseGenericDto {
    @NotNull
    private String name;

    @NotNull
    private String definition;
}
