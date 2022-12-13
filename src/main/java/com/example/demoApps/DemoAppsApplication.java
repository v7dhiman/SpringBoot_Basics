package com.example.demoApps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoAppsApplication
{
	private static Logger logger = LoggerFactory.getLogger(DemoAppsApplication.class);
	public static void main(String[] args)
	{
		SpringApplication.run(DemoAppsApplication.class, args);
		logger.info("My app started");

		OtherClassImpl otherClass = new OtherClassImpl();
		logger.info("Result of 2 and 3 = {}", otherClass.add(2, 3));

		DemoController demoController = new DemoController();  //Not be stored IOC container
		logger.info("demoController object is {} ", demoController);
	}

}
//1. Inversion of control  --> creating shared singleton instance --> bean --> IOC container
//2. Dependency injection  --> Using the shared instance from other classes

//Creating object...com.example.demoApps.DemoController@bd1111a --> Constructor
//Creating object...com.example.demoApps.DemoController@122d6c22 --> new Keyword