package com.onyx.FirstTest.exception;

import com.onyx.FirstTest.master.HeaderResponse;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {

    private HeaderResponse header ;
    private Object data;
//    private Body data ;



}
