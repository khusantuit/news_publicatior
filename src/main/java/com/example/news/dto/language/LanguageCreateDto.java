package com.example.news.dto.language;

import com.example.news.dto.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageCreateDto implements BaseDto {
    @NotBlank
    private String name;

    @NotBlank
    private String definition;
}
