package com.example.news.dto.info;

import com.example.news.dto.BaseGenericDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfoDto extends BaseGenericDto {
    @NotNull
    private String key;
    @NotNull
    private List<InfoValueDto> values;
}
