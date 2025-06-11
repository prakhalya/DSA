package addon;


	import java.util.Scanner;

	public class Node {
	
	    int data;
	    Node next;

	   
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	class Link {
	    Node head;

	   
	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;

	            while (temp.next != null) {
	                temp = temp.next;
	            }

	            temp.next = newNode;
	        }

	        System.out.println("Inserted: " + data);
	        
	    }
	    public void delete(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        if (position == 0) {
	            System.out.println("Deleted: " + head.data);
	            head = head.next;
	            return;
	        }

	        Node temp = head;

	        for (int i = 0; i < position - 1; i++) {
	            if (temp == null || temp.next == null) {
	                System.out.println("Position out of bounds.");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }

	        System.out.println("Deleted: " + temp.next.data);
	        temp.next = temp.next.next;
	    }
	    public void traverse() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Link list = new Link();
	        int choice;

	        do {
	            System.out.println("\n--- Singly Linked List Menu ---");
	            System.out.println("1. Insert at End");
	            System.out.println("2. Delete at Position");
	            System.out.println("3. Traverse");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int val = sc.nextInt();
	                    list.insert(val);
	                    break;

	                case 2:
	                    System.out.print("Enter position to delete (0-based): ");
	                    int pos = sc.nextInt();
	                    list.delete(pos);
	                    break;

	                case 3:
	                    list.traverse();
	                    break;

	                case 4:
	                    System.out.println("Exiting program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


