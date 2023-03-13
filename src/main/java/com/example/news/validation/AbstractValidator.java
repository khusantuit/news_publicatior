package com.example.news.validation;

import com.example.news.criteria.BaseCriteria;
import com.example.news.dto.BaseDto;
import jakarta.validation.ValidationException;

import java.io.Serializable;

public abstract class AbstractValidator<CD extends BaseDto, UD extends BaseDto, C extends BaseCriteria, ID extends Serializable> implements BaseValidator {

//    public static final UtilsForSessionUser sessionUser = null;
    public abstract void validateKey(ID id) throws ValidationException;

    public abstract void validOnCreate(CD createDto) throws ValidationException;

    public abstract void validOnUpdate(UD updateDto) throws ValidationException;

    public abstract void validCriteria(C criteria);

    public void validPermission(String... roles){

    }

}
