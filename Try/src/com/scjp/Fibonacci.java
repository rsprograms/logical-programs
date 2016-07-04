package com.scjp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenVal = Integer.valueOf(args[0]);
		Map<Integer, Long> dynamicVals = new HashMap<Integer, Long>();
		long output = computeFibonacci(dynamicVals, givenVal);	
	

		Iterator<Entry<Integer, Long>> mapIterator = dynamicVals.entrySet().iterator();
			while(mapIterator.hasNext()) {
				Map.Entry<Integer, Long> entrySet = (Map.Entry<Integer, Long>) mapIterator.next();
				System.out.println("Key : " + entrySet.getKey() + "Value : " + entrySet.getValue());
			}
			
		System.out.println("Answer : " + output);

	}

	private static Long computeFibonacci(Map<Integer, Long> tmpMap, int givenVal) {
		
		
		long retVal;
		
		/*switch(givenVal) {
		
			case 0 : return f0();
			
			case 1 : return f1();
			
			default : return computeFibonacci(givenVal - 1) + computeFibonacci(givenVal - 2);
			
			
		}*/
	
		
		if (givenVal == 0) {
			retVal = new Long(0);
			tmpMap.put(0, retVal);
			return retVal;
		} else if (givenVal == 1) {
			int i = 1;
			retVal = new Long(1);
			tmpMap.put(1, retVal);
			return retVal;
		} else {
			if (tmpMap.containsKey(givenVal)) {
				return tmpMap.get(givenVal);
			} else {
				retVal = computeFibonacci(tmpMap, givenVal-1) + computeFibonacci(tmpMap, givenVal-2);
				tmpMap.put(givenVal, retVal);
				return retVal;
			}
		}
		
	
		
	}
	
	private static int f1() {
		return 1;
	}
	
	private static int f0() {
		return 0;
	}

}
