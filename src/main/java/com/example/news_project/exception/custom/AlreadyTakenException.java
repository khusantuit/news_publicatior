package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class AlreadyTakenException extends BaseException {
    public AlreadyTakenException(String element) {
        super(element + " already taken");
    }
}
