package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class FileNotFoundException extends BaseException {
    public FileNotFoundException(String message, String stackTrace) {
        super(message, stackTrace);
    }
}
