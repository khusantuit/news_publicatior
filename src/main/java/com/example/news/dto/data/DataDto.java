package com.example.news.dto.data;

import com.example.news.dto.error.AppErrorDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDto<T> implements Serializable {
    protected T data;

    protected AppErrorDto error;

    protected boolean success;

    private Integer totalCount;

    private Long allTotalCount;

    public DataDto(T data) {
        this.data = data;
        this.success = true;
    }

    public DataDto(AppErrorDto error) {
        this.error = error;
        this.success = false;
    }

    public DataDto(T data, Integer totalCount) {
        this(data);
        this.totalCount = totalCount;
    }

    public DataDto(T data, Integer totalCount, Long allTotalCount) {
        this(data, totalCount);
        this.allTotalCount = allTotalCount;
    }
}
