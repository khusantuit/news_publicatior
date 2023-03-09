package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class NotSavedException extends BaseException {
    public NotSavedException(String message) {
        super(message);
    }

    public NotSavedException(String message, String stackTrace) {
        super(message, stackTrace);
    }
}
