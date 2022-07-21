package com.onyx.FirstTest.api.service;

import com.onyx.FirstTest.exception.BaseException;
import com.onyx.FirstTest.exception.TestException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class TestService {

    public String getDataById(String id) throws BaseException {

//            id = null;
//            if(ObjectUtils.isEmpty(id)){
//throw   TestException.testDataNull("test error");
//            }
        return id;

    }
}
