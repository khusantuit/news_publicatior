package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class NotSavedException extends BaseException {
    public NotSavedException(String message) {
        super(message);
    }

    public NotSavedException(String message, String stackTrace) {
        super(message, stackTrace);
    }
}
