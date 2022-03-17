package com.simplilearn.stack.arraystack;

import java.util.EmptyStackException;

// stack implementation based on array
public class ArrayStack {
	
	// Stack : one end to insert and remove data element
	private int top;
	
	private Employee[] stack;
	
	// create stack
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	// size
	public int size() {
		return top;
	}
	
	// is empty
	public boolean isEmpty() {
		return top==0;
	}
	
	// push  -> push added data from the top and auto grwo the array stack
	public void push(Employee data) {
		// stack is full -> increase capacity of stack
		if(top==stack.length) {
			// double stack size
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}
		// add value in stack array
		stack[top++] = data;
	}
	
	// pop -> pop remove top element from stack and return the removed element
	public Employee pop() {
		// verfiy stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		// remove element from the top
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}
		
	// peek
	public Employee peek() {
		// verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	// print stack
	public void printStack() {
		System.out.println(" top -> ");
		for(int index=top-1; index>=0; index--) {
			System.out.println(stack[index]);
		}
	}
	
}
