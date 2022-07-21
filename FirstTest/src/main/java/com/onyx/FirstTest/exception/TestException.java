package com.onyx.FirstTest.exception;

public class TestException extends BaseException {

    public TestException(String msg) {
        super("Hello." + msg);
    }

    public static TestException testDataNull(String msg) {
        return new TestException(msg);

    }
}
