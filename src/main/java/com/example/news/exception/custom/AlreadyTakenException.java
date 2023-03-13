package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class AlreadyTakenException extends BaseException {
    public AlreadyTakenException(String element) {
        super(element + " already taken");
    }
}
