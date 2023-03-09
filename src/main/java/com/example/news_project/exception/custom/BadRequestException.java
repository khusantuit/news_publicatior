package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class BadRequestException extends BaseException {
    public BadRequestException(String message) {
        super(message);
    }
}
