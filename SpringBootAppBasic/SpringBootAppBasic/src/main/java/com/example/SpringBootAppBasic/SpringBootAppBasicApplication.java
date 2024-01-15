package com.example.SpringBootAppBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppBasicApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootAppBasicApplication.class, args);
//        Coder coder=context.getBean(Coder.class);
//        coder.code();
//		coder.age=45;
//		System.out.println(coder.age);//45

		// both object reffering to same bean(object) ->prototype
//		Coder coder2=context.getBean(Coder.class);
//		coder2.code();
//		System.out.println(coder2.age);//45

		//if want to the object refer to different object using singleton

		Coder coder=context.getBean(Coder.class);
        coder.code();
		System.out.println(coder.getAge());

	}

}
