package com.example.news.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class BaseException extends RuntimeException{

    private String message;
    private String developerMessage;

    public BaseException(String message) {
        this.message = message;
        this.developerMessage = Arrays.toString(super.getStackTrace());
    }

    public BaseException(String message, String stackTrace) {
        this.message = message;
        this.developerMessage = stackTrace;
    }
}
