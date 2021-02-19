package com.LinkedList;

public class LinkedListClient {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtFirst(2);
        list.insertAtFirst(5);
        //list.display();
        list.insertAtLast(3);
        list.insertAtLast(8);
        //list.display();
        list.deleteAtLast();
        list.deleteAtFirst();
        System.out.println("mid :" +list.mid());
        list.display();
        System.out.println(list.cycleDetection());
    }
}
