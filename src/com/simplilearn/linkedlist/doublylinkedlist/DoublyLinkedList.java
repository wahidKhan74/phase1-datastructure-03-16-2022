package com.simplilearn.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private int size;
	private Node tail;

	// get size
	public int getSize() {
		return size;
	}

	// is empty
	public boolean isEmpty() {
		return head == null;
	}

	// add element to front
	public void addTofront(Employee data) {
		// create a a node
		Node node = new Node(data);
		if(isEmpty()) {
			tail = node;
		}else {
			head.setPrevious(node);
			node.setNext(head);
		}
		// new node as head
		head = node;
		size++;
	}

	// add element to end
	public void addToEnd(Employee data) {
		// create a a node
		Node node = new Node(data);		
		if(isEmpty()) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// new node is tail node
		tail = node;
		size++;
	}

	// remove from front
	public Node removeFromFront() {
		// if list empty return null		
		if (isEmpty()) {
			return null;
		}
		Node removeNode = head;
		// only one element
		if(head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		// next node as head
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}

	// remove from end
	public Node removeFromEnd() {
		// if list empty return null
		if (isEmpty()) {
			return null;
		}
		Node removeNode = tail;
		// only one element
		if(tail.getPrevious() ==null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		// next nod as tail
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}

	// print list
	public void printList() {
		Node current = head;
		System.out.print(" Head => ");
		while (current != null) {
			
			System.out.println(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("<= Tail");
	}
}
