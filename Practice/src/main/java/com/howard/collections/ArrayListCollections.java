package com.howard.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListCollections {

	public static void main(String[] args) {
		int length = 0;

		ArrayList<String> arrayListTesttwo = new ArrayList<String>();
		arrayListTesttwo.add("sample");
		arrayListTesttwo.add("for");
		arrayListTesttwo.add("arraylist");
		arrayListTesttwo.add("weakhaters");
		
		for (String name : arrayListTesttwo) {
			System.out.println(name);
			System.out.println();
		}
		System.out.println("outside");
			
		
		ArrayList<String> arrayListTest = new ArrayList<String>();

		arrayListTest.add("help");
		arrayListTest.add("sample");
		arrayListTest.removeAll(arrayListTest);
		arrayListTest.add("help");
		arrayListTest.add("sample");
		arrayListTest.add("never");
		arrayListTest.add("givingup");
		arrayListTest.add(3, "fuckinglost");
		arrayListTest.addFirst("howard");
		arrayListTest.addLast("lastplace");
		arrayListTest.set(0, "pizza");
		arrayListTest.remove(2);
		arrayListTest.remove("help");
		
		for(String names: arrayListTest) {
			System.out.println(names + " insdie ArrayList");
			
		}
		System.out.println("Outside of ArrayList");
		System.out.println();
		System.out.println();


		
		System.out.println(arrayListTest.subList(0, 3));
		System.out.println(arrayListTest.size());
		System.out.println(arrayListTest);

		Iterator itr = arrayListTest.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		for(String words:arrayListTest) {
			System.out.println(words+ " " + words.length());
		}
		
		Collections.sort(arrayListTest);
		System.out.println();
		for(String cells: arrayListTest) {
			System.out.println(cells);
		}
		
		
		
		

		// System.out.println(arrayListTest.spliterator().toString());

		// dynamic sized array with unlimited size
		// implements list interface so has all methods
		// maintains insertion order internally
		/*
		 * ArrayList can contain duplicate elements ArrayList maintains insertion order
		 * ArrayList class in non-synchronized ArrayList allows random access works on
		 * index basis
		 * 
		 * ArrayList is slower thank LinkedList because shifting must occur to remove
		 * elements
		 * 
		 * ArrayList cannot hold primitive types such as : int, char, float without a
		 * wrapper class
		 * 
		 * ArrayList extends AbstractList implements ListInterface extends Collection
		 * Interface extends iterable Interface
		 * 
		 * 
		 * 
		 */

	}

}
