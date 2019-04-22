package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-22T06:53:10.731Z")

@RestSchema(schemaId = "project8ah2")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project8ah2Impl {

    @Autowired
    private Project8ah2Delegate userProject8ah2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject8ah2Delegate.helloworld(name);
    }

}
