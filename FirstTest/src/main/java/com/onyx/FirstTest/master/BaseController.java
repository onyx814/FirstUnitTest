package com.onyx.FirstTest.master;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
public class BaseController {


    private HeaderResponse iniHeader() {
        return new HeaderResponse(HttpStatus.OK.value(), "Success.");
    }

    protected <T> ResponseObject<T> createResponse(T data) {
        ResponseObject resp = new ResponseObject();
        resp.setHeader(this.iniHeader());
        resp.setData(data);
        return resp;
    }

    protected <T> ResponseList<T> createResponse(List<T> data) {
        ResponseList resp = new ResponseList();
        resp.setHeader(this.iniHeader());
        resp.setData(data);
        return resp;
    }

}


