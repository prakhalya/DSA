package day1;

public class Circular_Link {

    Node last;

    class Node {
        int data;
        Node next = null;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Circular_Link() {
        last = null;
    }

    public void insertAtBegin(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;
            last.next = last;
        } else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }

    public void insertAtLast(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;
            last.next = last;
        } else {
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }
    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = last.next;
        while (temp != last) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String args[]) {
    	Circular_Link l = new Circular_Link();
        l.insertAtBegin(100);
        l.insertAtBegin(10);
        l.insertAtLast(111);
        l.insertAtLast(222);
        l.insertAtBegin(20);
        l.insertAtBegin(66);
        l.insertAtBegin(77);
        l.display();
    }
}

