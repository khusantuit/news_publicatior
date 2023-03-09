package com.example.news_project.dto.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppErrorDto {
    private Timestamp timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    private String developerMessage;

    @Builder
    public AppErrorDto(HttpStatus status, String message, String developerMessage, WebRequest request) {
        this.developerMessage = developerMessage;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.status = status.value();
        this.error = status.getReasonPhrase();
        this.message = message;

        if(Objects.nonNull(request)) {
            this.path = ((ServletWebRequest) request).getRequest().getRequestURI();
        }
    }

    @Builder(builderMethodName = "secondBuilder")
    public AppErrorDto(HttpStatus status, String message, String path) {
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.status = status.value();
        this.error = status.getReasonPhrase();
        this.message = message;
        this.path = path;
    }
}
