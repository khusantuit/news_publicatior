package com.example.news.dto.info;

import com.example.news.dto.BaseDto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoValueCreateDto implements BaseDto {
    @NotNull
    private String infoId;

    @NotNull
    private String value;

    @NotNull
    private String languageId;
}
