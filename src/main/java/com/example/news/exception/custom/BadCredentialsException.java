package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class BadCredentialsException extends BaseException {
    public BadCredentialsException() {
        super("Bad credentials");
    }
}
