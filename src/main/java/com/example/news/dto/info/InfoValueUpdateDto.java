package com.example.news.dto.info;

import com.example.news.dto.BaseGenericDto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoValueUpdateDto extends BaseGenericDto {
    @NotNull
    private String value;

//    @NotNull
    private String infoId;

//    @NotNull
    private String languageId;
}
