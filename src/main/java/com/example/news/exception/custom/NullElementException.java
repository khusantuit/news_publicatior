package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class NullElementException extends BaseException {
    public NullElementException(String fieldName) {
        super(fieldName);
    }
}
