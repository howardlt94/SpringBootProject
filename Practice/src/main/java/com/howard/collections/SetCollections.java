package com.howard.collections;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

public class SetCollections {

	public static void main(String[] args) {
		
		//it is a unordered collection which cannot contain duplicate values
		
		Set<String> setSample = new HashSet<>();
		setSample.add("samplehelp");
		setSample.add("samplehelp");
		setSample.add("different");
		
		System.out.println(setSample.hashCode());
		System.out.println();
		System.err.println(setSample.isEmpty());
		System.out.println();
		System.out.println(setSample.iterator());
		System.out.println();
		System.out.println(setSample.size());
	
		Object[] setNames = setSample.toArray();
		
		System.out.println(setNames);
		System.out.println(Arrays.asList(setNames));
		
		//arrays
		int[] intArry = {};
		String[] stringArry = {"hi","object"};
		System.out.println(Arrays.asList(stringArry));
	}
}
