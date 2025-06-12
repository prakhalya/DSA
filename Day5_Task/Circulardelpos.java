package day1;

public class Circulardelpos {
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
        public void deleteAtPosition(int pos) {
            if (last == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }
            if (pos <= 0) {
                System.out.println("Invalid position.");
                return;
            }
            Node current = last.next;
            Node prev = last;
            int count = 1;
            if (pos == 1) { 
                if (last.next == last) {
                    last = null;
                } else {
                    last.next = current.next;
                }
                System.out.println("Deleted node at position 1.");
                return;
            }
            while (count < pos && current != last) {
                prev = current;
                current = current.next;
                count++;
            }
            if (count < pos) {
                System.out.println("Position out of bounds.");
                return;
            }
            prev.next = current.next;
            if (current == last) {
                last = prev;
            }
            System.out.println("Deleted node at position " + pos + ".");
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
    	Circulardelpos clwm = new Circulardelpos();
        Circul cll = clwm.new Circul();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);
        cll.insertAtEnd(50);

        System.out.println("List before deletion:");
        cll.display();

        cll.deleteAtPosition(3); 

        System.out.println("List after deleting position 3:");
        cll.display();

        cll.deleteAtPosition(1); 

        System.out.println("List after deleting position 1:");
        cll.display();

        cll.deleteAtPosition(10); 

        System.out.println("List final state:");
        cll.display();
    }
}
