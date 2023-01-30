package com.cg.junitproject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.junitproject.HashMapClass;

public class HaspMapClassTest {
	@Test
	public void testHashmap() {
		HashMapClass hmc = new HashMapClass();
		assertEquals(false, hmc.valueInHasMap());
		
	}
	@Test
	public void testage() {
		HashMapClass hmc = new HashMapClass();
		assertEquals(116, hmc.calculateAge(hmc.list));
	}

}
