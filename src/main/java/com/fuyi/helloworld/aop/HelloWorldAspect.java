package com.fuyi.helloworld.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面对象
 * 切面就是包含切入点和通知的对象
 * @author Administrator
 *
 */
public class HelloWorldAspect {

	/**
	 * 前置通知
	 */
	public void beforeAdvice() {
		System.out.println("=============== before advice");
	}
	/**
	 * 后置最终通知
	 */
	public void afterFinallyAdvice() {
		System.out.println("=============== after finally advice");
	}
	
	
	
	
	public void beforeAdvice(String param111) {
		System.out.println("==============  say before advice param=" + param111);
	}
	
	public void afterReturningAdvice(Object retVal) {
		System.out.println("==============  after returning advice retVal=" + retVal);
	}
	
	
	public void afterThrowingAdvice(Exception exception) {
		System.out.println("==============  after throwing advice exception=" + exception);
	}
	
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("========== around before advice");
		Object retVal = pjp.proceed(new Object[]{"replace"});
		System.out.println("========== around after advice");
		return retVal;
	}
	
}
