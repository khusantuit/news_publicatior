package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class PermissionDeniedException extends BaseException {
    public PermissionDeniedException() {
        super("Permission denied");
    }
    public PermissionDeniedException(String message) {
        super(message);
    }
}
