package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject8ah2 {

        Project8ah2Delegate project8ah2Delegate = new Project8ah2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project8ah2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}