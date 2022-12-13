package com.example.demoApps;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class DemoController
{
    @Autowired
    Demo demo;
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    public DemoController()
    {
        logger.info("Creating object...{}", this);
    }
    @GetMapping("/sample")
    public Demo getDemo()
    {
        //Demo demo = new Demo();
        logger.info("demo object in sample API {}", demo);
        return demo;
    }
}
//com.example.demoApps.Demo@6a805a7b
//com.example.demoApps.Demo@4ebfbecd
//com.example.demoApps.Demo@1202b635

//com.example.demoApps.Demo@6c09a57d
//com.example.demoApps.Demo@6c09a57d