class StackNode {
    int data;
    StackNode next;
}

public class p23 {
    static StackNode top = null;

    static boolean isEmpty() {
        return top == null;
    }

    static void push(int data) {
        StackNode newNode = new StackNode();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    static void insertAtBottom(int item) {
        if (isEmpty()) {
            push(item);
        } else {
            int temp = pop();
            insertAtBottom(item);
            push(temp);
        }
    }

    static void reverse() {
        if (!isEmpty()) {
            int temp = pop();
            reverse();
            insertAtBottom(temp);
        }
    }

    static void print() {
        StackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(4);
        push(3);
        push(2);
        push(1);

        System.out.println("Original Stack:");
        print();

        reverse();

        System.out.println("Reversed Stack:");
        print();
    }
}
