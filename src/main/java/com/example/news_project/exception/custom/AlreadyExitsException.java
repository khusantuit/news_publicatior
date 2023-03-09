package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class AlreadyExitsException extends BaseException {
    public AlreadyExitsException(String message) {
        super(message);
    }
}
