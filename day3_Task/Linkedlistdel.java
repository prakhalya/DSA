package day1;

public class Linkedlistdel {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        Node current = head;
        if (head == null) {
            head = newNode;
            return;
        }
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

    public void deleteAt(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int index = 0;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
            if(current == null || current.next == null){
                return;
            }
        }
        current.next = current.next.next;
    }

    public void traverse() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Linked list values: ");
        while (current != null) {
            System.out.print(current.value + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlistdel list = new Linkedlistdel();
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

        list.deleteAt(0);
        list.traverse();

        list.deleteAt(2);
        list.traverse();
    }
}
