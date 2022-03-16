package com.simplilearn.linkedlist.doublylinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);
		
		// create instance of singly linked list
		DoublyLinkedList dList  = new DoublyLinkedList();
		
		System.out.println("List Size : "+dList.getSize());
		System.out.println("List Empty : "+dList.isEmpty());
		
		System.out.println("----------------");
		dList.addTofront(employee1);
		dList.addTofront(employee2);
		dList.addTofront(employee3);
		
		System.out.println("List Size : "+dList.getSize());
		System.out.println("List Empty : "+dList.isEmpty());
		dList.printList();
		System.out.println("----------------");
		
		dList.addToEnd(employee4);
		dList.addToEnd(employee5);
		System.out.println("----------------");
		
		System.out.println("List Size : "+dList.getSize());
		System.out.println("List Empty : "+dList.isEmpty());
		dList.printList();
		
		
		System.out.println("----------------");
		Node reNode= dList.removeFromFront();
		System.out.println("Removed First Node :"+reNode);
		dList.printList();
		
		
		System.out.println("----------------");
		Node laNode= dList.removeFromEnd();
		System.out.println("Removed Last Node :"+laNode);		
		System.out.println("----------------");
		dList.printList();
	}

}
