package com.scjp;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FactorialTest {
	
	Factorial fact = new Factorial();
	Map<Integer, Long> dynaMap = new HashMap<Integer, Long>();	
		
	
	@Test
	public void testComputeFactorial() {
		dynaMap.put(1, new Long(1));
		assertEquals(new Long(6), fact.computeFactorial(dynaMap, 3));
	}

}
