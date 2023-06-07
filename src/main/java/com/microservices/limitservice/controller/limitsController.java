package com.microservices.limitservice.controller;


import com.microservices.limitservice.LimitService.Limits;
import com.microservices.limitservice.LimitServiceConfiguration.ConfigurationL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsController {

  //  @Autowired

    @Autowired
    private ConfigurationL configurationL;
    @GetMapping("/limits")
    public Limits retreiveLimits(){
        //return new Limits(1,1000);
        return new Limits(configurationL.getMinimum(), configurationL.getMaximum());
    }
}
