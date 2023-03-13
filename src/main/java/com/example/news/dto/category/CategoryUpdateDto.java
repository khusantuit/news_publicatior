package com.example.news.dto.category;

import com.example.news.dto.BaseGenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryUpdateDto extends BaseGenericDto {
    @NotNull
    private String parentId;
}
