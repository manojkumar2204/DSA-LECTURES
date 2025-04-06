class StackNode {
    int data;
    StackNode next;
}

public class p22 {
    static StackNode root = null;

    static boolean isEmpty() {
        return root == null;
    }

    static void push(int data) {
        StackNode newNode = new StackNode();
        newNode.data = data;
        newNode.next = root;
        root = newNode;
        System.out.println(data + " pushed to stack");
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int popped = root.data;
        root = root.next;
        return popped;
    }

    static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return root.data;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println(pop() + " popped from stack");
        System.out.println("Top element is " + peek());
    }
}
