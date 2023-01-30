package com.cg.junitproject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.junitproject.HelloWorld;

public class HelloWorldTest {
	@Test
	public void testHelloworld() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello World !", hw.hello());
		
	}

}
