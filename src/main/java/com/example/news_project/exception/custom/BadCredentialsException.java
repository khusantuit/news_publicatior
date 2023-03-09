package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class BadCredentialsException extends BaseException {
    public BadCredentialsException() {
        super("Bad credentials");
    }
}
