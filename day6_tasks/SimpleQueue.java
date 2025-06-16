package day1;

public class SimpleQueue {
    int[] queue;    
    int front;    
    int rear;       
    int capacity;   
    int size;        
    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear++;
        if (rear == capacity) {
            rear = 0; 
        }
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued");
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front++;
        if (front == capacity) {
            front = 0; 
        }
        size--;
        return item;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);
       q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front element is: " + q.peek());
        System.out.println(q.dequeue() + " dequeued");
        System.out.println("Front element is: " + q.peek());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        while (!q.isEmpty()) {
            System.out.println(q.dequeue() + " dequeued");
        }
        q.dequeue(); 
    }
}

