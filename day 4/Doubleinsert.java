package day1;

public class Doubleinsert {
    static class Node {
        int value;
        Node next;
        Node prev; 
        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null; 
        }
    }
    private Node head;
    public Doubleinsert() {
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
        newNode.prev = current; 
    }
    public void insertAtMiddle(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        newNode.prev = slow;
        if (slow.next != null) {
            slow.next.prev = newNode; 
        }
        slow.next = newNode;
    }
    public void traverse() {
        System.out.print("Doubly linked list values: ");
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" <-> "); 
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doubleinsert list = new Doubleinsert();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.traverse();

        list.insertAtMiddle(12);
        list.traverse();
    }
}

