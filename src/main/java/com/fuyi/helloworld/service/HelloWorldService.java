package com.fuyi.helloworld.service;

public interface HelloWorldService {

	public void sayBefore(String param);
	public void sayHello();
	
	public boolean sayAfterReturning();
	
	public void sayAfterThrowing();
	
	public boolean sayAfterFinally();
	
	public void sayAround(String param);
	
	public void sayAdvisorBefore(String param);
}
