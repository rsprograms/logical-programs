package com.rs;

public class MyLinkedList {
	
	private MyLinkedListNode head;
	
	private MyLinkedListNode tail;
	
	private int size;
	
	private void insertAtFront(MyLinkedListNode newNode) {
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head.getNext());
			head = newNode;
		}		
	}

}
