package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class FileNotFoundException extends BaseException {
    public FileNotFoundException(String message, String stackTrace) {
        super(message, stackTrace);
    }
}
