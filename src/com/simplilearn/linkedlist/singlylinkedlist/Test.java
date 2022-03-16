package com.simplilearn.linkedlist.singlylinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);
		
		// create instance of singly linked list
		SinglyLinkedList list = new SinglyLinkedList();
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty : "+list.isEmpty());
		
		// add data in front
		list.addTofront(employee1);
		list.addTofront(employee2);
		list.addTofront(employee3);
		list.addTofront(employee4);
		list.addTofront(employee5);
		
		
		System.out.println("--------------------");
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty : "+list.isEmpty());
		System.out.println("--------------------");
		list.printList();
		
		list.removeFromtNode();		
		System.out.println("--------------------");
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Empty : "+list.isEmpty());
		System.out.println("--------------------");
		list.printList();
	}

}
