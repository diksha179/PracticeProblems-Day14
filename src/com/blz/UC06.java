package com.blz;


public class UC06 {

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

    public void pop() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node temp = head;
                while(temp.next != tail) {
                	temp = temp.next;
                }
                tail = temp;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public static void main(String[] args) {
        UC06 list = new UC06();

        list.add(70);
        list.add(30);
        list.add(56);
        list.display();
        list.pop();
        list.display();
    }
}

