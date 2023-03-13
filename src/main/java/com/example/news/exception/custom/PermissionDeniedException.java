package com.example.news.exception.custom;

import com.example.news.exception.BaseException;

public class PermissionDeniedException extends BaseException {
    public PermissionDeniedException() {
        super("Permission denied");
    }
    public PermissionDeniedException(String message) {
        super(message);
    }
}
