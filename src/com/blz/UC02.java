package com.blz;

public class UC02 {
	
	public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int ele) {
            data = ele;
            next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        
        while (temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        UC02 list = new UC02();

        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

    }
}

