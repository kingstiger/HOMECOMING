package com.homecoming.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app/v1")
public class TestController {

    @GetMapping("/test/{testArgPath}")
    public String test(@PathVariable("testArgPath") String testArgPath,
                       @RequestParam("testArgRequest") String testArgRequest) {
        return "TEST SUCCESS WITH PATH: " + testArgPath + " AND ARG: " + testArgRequest;
    }

}
