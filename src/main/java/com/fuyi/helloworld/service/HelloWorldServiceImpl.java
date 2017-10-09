package com.fuyi.helloworld.service;

public class HelloWorldServiceImpl implements HelloWorldService {

	public void sayBefore(String param) {
		System.out.println("================  say " + param);
	}
	
	public void sayHello() {
		System.out.println("================= hello world!!!");
	}

	public boolean sayAfterReturning() {
		System.out.println("================  after returning");
		return true;
	}

	public void sayAfterThrowing() {
		System.out.println("==============  before throwing");
		throw new RuntimeException();
	}

	public boolean sayAfterFinally() {
		System.out.println("================  after finally");
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return true;
	}

	public void sayAround(String param) {
		System.out.println("===============  around param=" + param);
	}

	public void sayAdvisorBefore(String param) {
		System.out.println("=============  say " + param);
	}
}
