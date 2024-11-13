package com.howard.collections;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack.empty());
		
		stack.add(5);
		stack.push(9);
		stack.add(5);
		stack.push(9);
		stack.add(5);
		stack.push(9);
		
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		System.out.println(stack.search(5));

		
		
		/*
		 * Stack is a collection that has LIFO order
		 * Stack has unique methods like 
		 * Push method inserts and element into top of the stack
		 * Pop method removes element from the top of the stack
		 * Peek method looks at top element of stack wihtout removing it
		 * search
		 * Empty stack when stack is empty top variable is -1 means stack is empty
		 * Stack index is 0,1,2 
		 * Stack extends Vector and implements List,Collection,Iterable,Cloneable,Serializable
		 * Stack has only one default constructor
		 * Stack() which creates a empty Stack
		 * Stack has a special method empty() to check if its empty 
		 *
		 *
		 */
		// TODO Auto-generated method stub

	}

}
