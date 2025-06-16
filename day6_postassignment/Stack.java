package day1;

public class Stack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top; 
    public Stack() {
        top = null;
    }
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " popped from stack");
        }
        stack.pop(); 
    }
}
