package com.onyx.FirstTest.api.controller;

import com.onyx.FirstTest.api.service.TestService;
import com.onyx.FirstTest.exception.BaseException;
import com.onyx.FirstTest.master.BaseController;
import com.onyx.FirstTest.master.ResponseList;
import com.onyx.FirstTest.master.ResponseObject;
import com.onyx.FirstTest.master.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    TestService svr = new TestService();
    //constructtor injection ใช้แทน @service
//    private final Service serviceName;
//    public TestController(Service name){
//        this.serviceName = name;
//    }

    @GetMapping("/{id}")
    public ResponseObject<String> getById() throws BaseException {
        return getById(null);
    }

    @GetMapping("/{id}")
    public ResponseObject<String> getById(@PathVariable String id) throws BaseException {


        return createResponse(svr.getDataById("1"));

    }

    @GetMapping()
    public ResponseList<String> getList() throws BaseException {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");

        return createResponse(list);
    }
}
