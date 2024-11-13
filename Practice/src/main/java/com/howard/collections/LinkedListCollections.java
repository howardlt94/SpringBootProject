package com.howard.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections {

	public static void main(String[] args) {
		
		LinkedList newList = new LinkedList<>();
		newList.add("String");
		newList.add("I");
		newList.add("wont");
		newList.add("give");
		newList.add("up");
		newList.add("String");
		newList.add("I");
		newList.add("wont");
		newList.add("give");
		newList.add("up");
		
		System.out.println(newList);
		
		newList.remove("wont");
		newList.remove(3);
		newList.removeFirst();
		newList.removeLast();
		
		System.out.println(newList);
		
		Iterator<String> itr = newList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		 * Linked list is a linear data structure
		 * where elements are not stored in contiguous 
		 * locations and every element is a separate object
		 * with a data part and address part.
		 * 
		 * Elements are linked using pointers and addresses.
		 * Elements in linked list are known as a node.
		 * 
		 * LinkedList have ease of insertions and deletions
		 * LinkedList have disadvantages like nodes cannot be accessed
		 * directly but must be accessed from the head and traversed to 
		 * the desired node.
		 * LinkedList act as a dynamic array we don't have to specify size
		 * LinkedList elements are not stored in continuous fashion
		 * LinkedList is implemented using doubly linked list structure
		 * Doubly LinkedList contains a extra pointer called the previous pointer
		 * with the data and the next pointer.
		 * 
		 * 
		 */
	}
}
