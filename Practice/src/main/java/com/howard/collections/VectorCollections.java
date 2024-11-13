package com.howard.collections;
import java.util.Vector;


public class VectorCollections {
	
	
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>(3,2);
		vector.add(5);
		vector.add(4);
		vector.add(2);
		vector.add(1);
		vector.add(5);
		vector.add(4);
		vector.add(2);
		vector.add(1);
		
		vector.insertElementAt(5, 0);
		vector.removeElementAt(1);
		vector.removeElementAt(2);
		vector.removeElementAt(3);
		
		System.out.println(vector);
		
		for(int i: vector) {
			System.out.println("inside vector: " + i);
		}
		
		/*
		 * Vector is a dynamic array it can grow and shrink as things
		 * are added and deleted, it is similar to a arraylist 
		 * Vector keeps insertion order
		 * Vector implements the List Interface so it has all its methods
		 * Vector is almost identical to Arraylist except that it is Synchornized
		 * Vector also has some legacy methods that collection framework does not
		 * Vector maintains its insertion order
		 * Vector is rarely used in non-Threaded enviorments becuase it is synchronized
		 * Vector is pretty much only used with threads since its synchronized
		 * becasue a Vector is synchornied it gives poor performance in adding/searching/deleting
		 * updating elements
		 * Iterators returned by Vector are failfast, during concurrent moddification it fails and throws the 
		 * ConcurrentModificationException
		 * 
		 * If increment is specifed Vector will expand to it each allocation cycle.
		 * If not increment is specfifed the vector capactiy will be doubled each cycle.
		 * Vector has 3 protected data members
		 * 
		 * int capacityIncrement contains the increment value
		 * int elementCount which is number of elements currently stored in the vector
		 * Object elementData[] Array that holds the data vector is stored in
		 * 
		 * Comes with four constructors
		 * Vector() defauk created vector with intial capacity of 10
		 * Vector(int size) creates a vector of a specfic size
		 * Vector(int size, int inc) creates vector of specfic size and the incrment value when resized
		 * Vector(Collection c) creates a vector that contains the elements of the collection
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
