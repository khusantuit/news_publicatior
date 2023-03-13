package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class AlreadyExitsException extends BaseException {
    public AlreadyExitsException(String message) {
        super(message);
    }
}
