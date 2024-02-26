package com.singlylinkedlist;



	public class SinglyLinkedLst {
		// Node class to represent each element in the linked list
		static class Node {
			int data;
			Node next;

			// Constructor to initialize the node with data
			public Node(int data) {
				this.data = data;
				this.next = null;
			}
		}

		// Head of the linked list
		private Node head;

		// Constructor to initialize an empty linked list
		 public SinglyLinkedLst() {
			// TODO Auto-generated constructor stub
			this.head = null;
		}
		 public static void main(String[] args) {
				// Create a linked list and add 5 nodes
				SinglyLinkedLst linkedList = new SinglyLinkedLst();
				linkedList.addNode(1);
				linkedList.addNode(2);
				linkedList.addNode(3);
				linkedList.addNode(4);
				linkedList.addNode(5);

				// Print the linked list
				System.out.print("Linked List: ");
				linkedList.printList();
				//linkedList.getlength();
				linkedList.deleteNode(3);
				System.out.print("Linked List: ");
				linkedList.printList();
			}
		 
		 public void deleteNode(int key) {
		        Node current = head;
		        Node prev = null;

		        // Search for the node to be deleted and keep track of the previous node
		        while (current != null && current.data != key) {
		            prev = current;
		            current = current.next;
		        }

		        // If the node is found, adjust the pointers to skip the node
		        if (current != null) {
		            if (prev == null) {
		                // If the node to be deleted is the head
		                head = current.next;
		            } else {
		                prev.next = current.next;
		            }
		            System.out.println("Node with data " + key + " deleted.");
		        } else {
		            System.out.println("Node with data " + key + " not found.");
		        }
		    }
		 
		// Method to get the length of the linked list
		private void getlength() {
			int count=0;
			Node current = head;
			while (current.next != null) {
				current = current.next;
				count++;
			}
			System.out.println("The length of the list is "+count);
			
			
		}
		// Method to add a new node to the linked list
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

		// Method to print the linked list
		public void printList() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

	}


