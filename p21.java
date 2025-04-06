public class p21 {
    static int top;
    static int capacity;
    static int[] array;

    static void createStack(int cap) {
        capacity = cap;
        top = -1;
        array = new int[capacity];
    }

    static boolean isFull() {
        return top == capacity - 1;
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        array[++top] = item;
        System.out.println(item + " pushed to stack");
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return array[top--];
    }

    static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return array[top];
    }

    public static void main(String[] args) {
        createStack(100);

        push(10);
        push(20);
        push(30);

        System.out.println(pop() + " popped from stack");
    }
}
