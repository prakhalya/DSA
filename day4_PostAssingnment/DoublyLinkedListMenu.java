package day1;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class Doubly {
    Node head;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public void deleteNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                if (temp == head) {
                    head = temp.next;
                }
                return;
            }
            temp = temp.next;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class DoublyLinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Doubly dll = new Doubly();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete a node");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    dll.insertAtEnd(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    int key=scanner.nextInt();
                    dll.deleteNode(key);
                    break;
                case 3:
                    dll.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

