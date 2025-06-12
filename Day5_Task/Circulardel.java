package day1;

public class Circulardel {

    Node last;
    class Node {
        int data;
        Node next = null;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    Circulardel() {
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
    public void deleteAtEnd() {
        if (last == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (last.next == last) {
            last = null;
            return;
        }
        Node temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp; 
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
        Circulardel l = new Circulardel();
        l.insertAtBegin(100);
        l.insertAtBegin(10);
        l.insertAtLast(111);
        l.insertAtBegin(20);
        l.insertAtBegin(66);
        l.insertAtBegin(77);    
        
        System.out.println("Circular Linked List:");
        l.display();
        
        l.deleteAtEnd();
        System.out.println("After deleting at end:");
        l.display();
    }
}
