package com.howard.collections;
import java.util.*;


public class MapCollections {
	
	public static void main(String[] args) {
		
	//Map cannot contain duplicate keys and each key can map at most
	/* to one value, some implemnetaions allow null keys or null values
	 * 
	 * TreeMap doesnt allow null values/null keys
	 * Hashmap/LinkedHashmap allows null vales/ null keys
	 * 
	 * TreeMap,Linkedhashmap have predictable orders
	 * Hashmap has random orders
	 * 
	 */
		
		Map<String, Integer> sampleMap = new HashMap<String, Integer>();
		sampleMap.put("a", 889);
		sampleMap.put("b", 888);
		sampleMap.put("c", 886);
		sampleMap.put("d", 885);
		sampleMap.put("x", 883);
		
		System.out.println(sampleMap);
		System.out.println(sampleMap);
		
		for(Map.Entry<String, Integer> proxy : sampleMap.entrySet()) {
			System.out.println(proxy.getKey() + " Map Keys");
			System.out.println(proxy.getValue() + "Map Values");
		}
		
	}

}
