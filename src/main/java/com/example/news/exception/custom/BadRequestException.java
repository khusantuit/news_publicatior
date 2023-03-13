package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class BadRequestException extends BaseException {
    public BadRequestException(String message) {
        super(message);
    }
}
