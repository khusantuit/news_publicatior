package com.example.news.dto.category;

import com.example.news.dto.BaseGenericDto;
import com.example.news.dto.info.InfoDto;
import com.example.news.entity.Info;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto extends BaseGenericDto {
    private String parentId;

    private List<InfoDto> infoList;
}
