package com.singlylinkedlist;

public class LinkedList {

	    static class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
	        LinkedList mergedList = new LinkedList();
	        Node current1 = list1.head;
	        Node current2 = list2.head;

	        while (current1 != null && current2 != null) {
	            if (current1.data < current2.data) {
	                mergedList.addNode(current1.data);
	                current1 = current1.next;
	            } else {
	                mergedList.addNode(current2.data);
	                current2 = current2.next;
	            }
	        }

	        // If there are remaining nodes in list1 or list2, add them to the merged list
	        while (current1 != null) {
	            mergedList.addNode(current1.data);
	            current1 = current1.next;
	        }

	        while (current2 != null) {
	            mergedList.addNode(current2.data);
	            current2 = current2.next;
	        }

	        return mergedList;
	    }

	    public static void main(String[] args) {
	        LinkedList list1 = new LinkedList();
	        list1.addNode(1);
	        list1.addNode(3);
	        list1.addNode(5);

	        LinkedList list2 = new LinkedList();
	        list2.addNode(2);
	        list2.addNode(4);
	        list2.addNode(6);

	        System.out.print("List 1: ");
	        list1.printList();

	        System.out.print("List 2: ");
	        list2.printList();

	        LinkedList mergedList = mergeSortedLists(list1, list2);

	        System.out.print("Merged Sorted List: ");
	        mergedList.printList();
	    }
	}

