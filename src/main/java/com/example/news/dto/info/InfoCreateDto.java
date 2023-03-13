package com.example.news.dto.info;

import com.example.news.dto.BaseDto;
import com.example.news.entity.InfoValue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoCreateDto implements BaseDto {
    private String key;
}
