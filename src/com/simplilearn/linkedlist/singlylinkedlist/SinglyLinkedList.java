package com.simplilearn.linkedlist.singlylinkedlist;


public class SinglyLinkedList {
	
	private Node head;
	private int size;
	
	// get size
	public int getSize() {
		return size;
	}
	
	// is empty
	public boolean isEmpty() {
		return head ==null;
	}
	
	// add to front
	public void addTofront(Employee data) {
		// create a a node
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		size++;
	}
	
	// remove from front
	public Node removeFromtNode() {
		if(isEmpty()) {
			return null;
		}
		Node removeNode = head;
		head= head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	// print list
	public void printList() {
		Node current  = head;
		System.out.println(" Head -> ");
		while(current !=null) {
			System.out.println(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
