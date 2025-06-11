package day1;
	public class LinkedListInsert {
	    static class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	            this.next = null;
	        }
	    }
	    private Node head;

	    public LinkedListInsert() {
	        this.head = null;
	    }
	    public void add(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	    public void insertAt(int value, int position) {
	        Node newNode = new Node(value);
	        if (position <= 0 || head == null) {
	      newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        int index = 0;
	        while (current.next != null && index < position - 1) {
	            current = current.next;
	            index++;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	    public void traverse() {
	        System.out.print("Linked list values: ");
	        Node current = head;
	        if (current == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        while (current != null) {
	            System.out.print(current.value);
	            if (current.next != null) {
	                System.out.print(" -> ");
	            }
	            current = current.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        LinkedListInsert list = new LinkedListInsert();
	        list.add(5);
	        list.add(10);
	        list.add(15);
	        list.traverse(); 

	        list.insertAt(1, 0);
	        list.traverse(); 

	        list.insertAt(7, 2);
	        list.traverse();  

	        list.insertAt(20, 10);
	        list.traverse(); 
	      
	        list.insertAt(0, -3);
	        list.traverse();  
	    }
	}


