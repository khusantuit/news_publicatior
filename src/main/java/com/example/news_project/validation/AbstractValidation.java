package com.example.news_project.validation;

import com.example.news_project.criteria.BaseCriteria;
import com.example.news_project.dto.BaseDto;

public abstract class AbstractValidation<CD extends BaseDto, UD extends BaseDto, C extends BaseCriteria> implements BaseValidation{

//    public static final UtilsForSessionUser sessionUser = null;

    public abstract void checkCreate(CD dto);

    public abstract void checkUpdate(UD dto);

    public abstract void checkCriteria(C criteria);

    public abstract void checkGet(String id);

}
