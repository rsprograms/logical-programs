package com.scjp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Long> dynamicMap = new HashMap<Integer, Long>();
		dynamicMap.put(1, new Long(1));
		int givenValue = Integer.valueOf(args[0]);	
		if (givenValue <= 0) {
			throw new ArithmeticException("Input cannot be less than OR Equal to 0");
		}
		Long output = computeFactorial(dynamicMap, givenValue);
		
		Iterator<Entry<Integer, Long>> mapIterator = dynamicMap.entrySet().iterator();
		
		while(mapIterator.hasNext()) {
			Map.Entry<Integer, Long> entry = (Map.Entry<Integer, Long>) mapIterator.next();
			System.out.println("Key : " + entry.getKey() + " Value : " +entry.getValue());
			
		}
		
		System.out.println("Output : " + output);

	}
	
	public static Long computeFactorial (Map<Integer, Long> dynaMap, int givenVal) {
		if (givenVal == 1) {
			return dynaMap.get(1);
		} else {
			Long returnValue = givenVal * computeFactorial(dynaMap, (givenVal - 1));
			return returnValue;
		}
	}
	
}
