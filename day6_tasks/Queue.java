package day1;
public class Queue {
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued");
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front++;
        size--;
        return item;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue() + " dequeued");
        System.out.println(q.dequeue() + " dequeued");

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        while (q.size > 0) {
            System.out.println(q.dequeue() + " dequeued");
        }

        q.dequeue(); 
    }
}

