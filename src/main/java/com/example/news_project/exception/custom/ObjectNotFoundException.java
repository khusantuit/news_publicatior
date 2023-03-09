package com.example.news_project.exception.custom;

import com.example.news_project.exception.BaseException;

public class ObjectNotFoundException extends BaseException {
    public ObjectNotFoundException() {
        super("Not found");
    }
    public ObjectNotFoundException(String message) {
        super(message);
    }



    //message = organization_not_found
    public ObjectNotFoundException(String message, String stackTrace) {
        super(message, stackTrace);
    }
}
