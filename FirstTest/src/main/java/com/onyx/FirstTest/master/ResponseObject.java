package com.onyx.FirstTest.master;

import lombok.Data;

@Data
public class ResponseObject<T> {
    private HeaderResponse header;
    private T data;


}
