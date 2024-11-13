package com.howard.collections;
import java.util.PriorityQueue;


public class PriorityQueueCollections {
	
	public static void main(String[] args) {
		

		 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		 PriorityQueue<Integer> pQueTwo = new PriorityQueue<>();
	
		 PriorityQueue<String> pQueString = new PriorityQueue<>();

		 pQueString.add("cow");
		 pQueString.add("bow");
		 pQueString.add("aow");
		 
		 System.out.println(pQueString);
		 
		 pQueue.add(10);
		 pQueue.add(15);
		 pQueue.add(25);
		 
		 System.out.println(pQueue);
		 System.out.println(pQueue.poll());
		 System.out.println(pQueue);
		 System.out.println(pQueue.peek());
		 
		 /*
	 * PriorityQueue follows a FIFO 
	 * PriorityQueue follows natural 
	 * ordering or by a specfic Comparator at Construction Time
	 * 
	 * Elements in PriorityQueue are added to the end 
	 * PriorityQueue doesnt allow null values
	 * PriorityQueue objects cannot be non-comparable
	 * PriorityQueue head is the least element with respect to ordering
	 * if tied they are broken arbitrially 
	 * PriorityQueue is not threadsafe 
	 * java has PriorityBlockingQueue/BlockingQueue interfeace for mulithreading use
	 * 
	 * PriorityQueue has methods Poll/Remove/Peek that access elements are head of the queue
	 * Poll prints top element of que and removes it
	 * 	when elements are Polled from que they output in ascending order
	 * Peek prints top element from que
	 * 
	 * 
	 * 
	 * 
	 */
		
		
		
	}

}
