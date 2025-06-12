package day1;

import java.util.Scanner;

public class Circular_menu {
    class Node {
        int data;
        Node next;
        Node(int data) {  
            this.data = data;
            this.next = null;
        }
    }
    class Circul {
        Node last;
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (last == null) {
                last = newNode;
                last.next = last; 
            } else {
                newNode.next = last.next;
                last.next = newNode;
                last = newNode; 
            }
        }
        public void deleteNode(int key) {
            if (last == null) return; 
            Node current = last.next;
            Node prev = last;
            do {
                if (current.data == key) {
                    if (current == last && current.next == last) {
                        last = null; 
                    } else {
                        if (current == last) {
                            last = prev; 
                        }
                        prev.next = current.next; 
                    }
                    return;
                }
                prev = current;
                current = current.next;
            } while (current != last.next);
        }
        public void display() {
            if (last == null) {
                System.out.println("List is empty.");
                return;
            }
            Node current = last.next;
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current != last.next);
            System.out.println("(back to head)");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circular_menu menu = new Circular_menu();
        Circul cll = menu.new Circul();     
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
                    cll.insertAtEnd(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    int key = scanner.nextInt();
                    cll.deleteNode(key);
                    break;
                case 3:
                    cll.display();
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
