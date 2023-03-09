package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class LogoNotFoundException extends BaseException {
    public LogoNotFoundException(String message) {
        super(message);
    }
}
