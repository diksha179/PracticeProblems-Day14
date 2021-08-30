package com.blz;

public class UC03 {
	
	public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data){
        Node newNode = new UC03.Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        UC03 list = new UC03();

        list.add(56);
        list.add(30);
        list.add(70);
        list.display();

    }
}
