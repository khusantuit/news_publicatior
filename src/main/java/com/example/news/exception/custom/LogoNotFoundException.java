package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class LogoNotFoundException extends BaseException {
    public LogoNotFoundException(String message) {
        super(message);
    }
}
