package com.onyx.FirstTest.master;

import lombok.Data;

import java.util.List;

@Data
public class ResponseList<T> {
    private HeaderResponse header;
    private List<T> data;
}
