public class p25 {

    static class Stack {
        int top;
        int maxSize;
        char[] array;

        Stack(int size) {
            maxSize = size;
            top = -1;
            array = new char[size];
        }

        boolean isFull() {
            return top == maxSize - 1;
        }

        boolean isEmpty() {
            return top == -1;
        }

        void push(char item) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            array[++top] = item;
        }

        char pop() {
            if (isEmpty()) {
                return '#'; 
            }
            return array[top--];
        }

        char peek() {
            if (isEmpty()) {
                return '#';
            }
            return array[top];
        }
    }

    static boolean isOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static void convertInfixToPostfix(String expr) {
        int len = expr.length();
        Stack stack = new Stack(len);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char ch = expr.charAt(i);

            if (isOperand(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                }
            } else { 
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

    
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + result);
    }

    public static void main(String[] args) {
        String expression = "((a+(b*c))-d)";
        convertInfixToPostfix(expression);
    }
}
