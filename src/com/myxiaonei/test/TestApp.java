package com.myxiaonei.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myxiaonei.service.TestService;

//import com.myxiaonei.domain.Country;
//import com.myxiaonei.domain.Province;


public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		TestService service=(TestService) ac.getBean("testService");
		System.out.println(service.getName());
		
/*		Country ct =new Country();
		ct.setName("china");
		ct.getProvinces();
		
		Province pc=new Province();
		pc.setId(1);
		pc.setCountry(ct);
		pc.setName("shandong");
		System.out.println(ct.getProvinces().size());
		System.out.println(pc.getCountry().getName());*/
	}
}
