package com.blz;

public class UC01 {

	Node head;
	static class Node {	 
		int data;
		Node next;
		Node(int ele) {
			data = ele;
			next = null;
		}
	}
	public static void main(String[] args) {
		UC01 linkedList = new UC01();
		
		linkedList.head = new Node(56);
		Node second = new Node(30);
		Node Third = new Node(70);

		linkedList.head.next = second;
		second.next = Third;

		while (linkedList.head != null) {
			System.out.println(linkedList.head.data);
			linkedList.head = linkedList.head.next;
		}
	}
	}



