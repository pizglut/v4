package com.example.v4.item.support;

import com.example.v4.item.support.exception.TytulNotFoundException;
import com.example.v4.response.ErrorMessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TytulExceptionAdvisor {

    private static final Logger LOG = LoggerFactory.getLogger(TytulExceptionAdvisor.class);

    @ExceptionHandler(TytulNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse tytulNotFound(TytulNotFoundException exception) {
        LOG.error(exception.getMessage(), exception);
        return new ErrorMessageResponse(exception.getLocalizedMessage());
    }
}
