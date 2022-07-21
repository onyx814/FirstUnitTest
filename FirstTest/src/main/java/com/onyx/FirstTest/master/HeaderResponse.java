package com.onyx.FirstTest.master;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class HeaderResponse {
    private LocalDateTime timestamp = LocalDateTime.now();
    private int statusCode;
    private String msg;


    public HeaderResponse(int statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
}
