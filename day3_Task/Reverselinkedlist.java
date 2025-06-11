package addon;

public class Reverselinkedlist {
	static class Node 
	{
	        int data;
	        Node next;

	        Node(int data) 
	        {
	            this.data = data;
	            this.next = null;
	        }
	    }
	Node head; 
	    public void append(int data) 
	    {
	        Node newNode = new Node(data);
	        if (head == null) 
	        {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) 
	        {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	    public void reverse() 
	    {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) 
	        {
	            next = current.next;   
	            current.next = prev;   
	            prev = current;       
	            current = next;
	        }

	        head = prev;
	    }
	    public void printList() 
	    {
	        Node current = head;
	        while (current != null) 
	        {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) 
	    {
	        Reverselinkedlist list = new Reverselinkedlist();
	        list.append(10);
	        list.append(20);
	        list.append(30);
	        list.append(40);
	        System.out.println("Original List:");
	        list.printList();
	        list.reverse();
	        System.out.println("Reversed List:");
	        list.printList();
	    }
	}




