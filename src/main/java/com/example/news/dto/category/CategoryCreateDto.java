package com.example.news.dto.category;

import com.example.news.dto.BaseDto;
import com.example.news.dto.info.InfoCreateDto;
import com.example.news.entity.Info;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryCreateDto implements BaseDto {
    private String parentId;

    private List<InfoCreateDto> infoList;
}
