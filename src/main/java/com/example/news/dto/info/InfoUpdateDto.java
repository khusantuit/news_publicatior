package com.example.news.dto.info;

import com.example.news.dto.BaseGenericDto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoUpdateDto extends BaseGenericDto {
    @NotNull
    private String parentId;

    @NotNull
    private String key;
}
