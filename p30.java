class QNode {
    int key;
    QNode next;

    QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    QNode front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    void enQueue(int key) {
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void deQueue() {
        if (this.front == null)
            return;

        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    void display() {
        QNode temp = front;
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class p30 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.deQueue();
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.deQueue();
        q.display();
    }
}
