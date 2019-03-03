package com.mxexample.controller;

import com.mxexample.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/")
    public String getFirstProduct() {
        return homeService.getFristProject();
    }
}
