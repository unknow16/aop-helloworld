package com.fuyi.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.transaction.PlatformTransactionManager;

import com.fuyi.helloworld.service.HelloWorldService;
import com.fuyi.helloworld.service.IntroductionService;

public class App {

	@Test
	public void testHelloWorld() throws Exception {
		//Resource r = null;
		PlatformTransactionManager m = null;
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		
		HelloWorldService service = (HelloWorldService) ac.getBean("helloWorldService");
		//service.sayHello();
		//service.sayBefore("before");
		//service.sayAfterReturning();
		//service.sayAfterThrowing();
		//service.sayAfterFinally();
		//service.sayAround("haha");
		service.sayAdvisorBefore("haha");
		
		//IntroductionService service = (IntroductionService) ac.getBean("helloWorldService");
		//service.induct();
	}
}
