package com.example.news.dto.language;

import com.example.news.dto.BaseGenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageUpdateDto extends BaseGenericDto {
    @NotBlank
    private String name;

    private String definition;

    private boolean isDeleted;

    private boolean isActive;

}
