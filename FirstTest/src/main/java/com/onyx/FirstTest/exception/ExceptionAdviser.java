package com.onyx.FirstTest.exception;

import com.onyx.FirstTest.master.HeaderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdviser {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException ex) {


        ErrorResponse resp = new ErrorResponse();
        resp.setHeader(new HeaderResponse(HttpStatus.EXPECTATION_FAILED.value(), ex.getMessage()));
        resp.setData(null);

//eResponse.setData(null);
        return new ResponseEntity<>(resp, HttpStatus.valueOf(HttpStatus.EXPECTATION_FAILED.value()));
    }
}
