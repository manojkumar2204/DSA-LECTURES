class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[this.capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int item) {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[front];
    }

    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[rear];
    }
}

public class p31 {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}
