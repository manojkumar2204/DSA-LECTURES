public class p24 {

    static char[] stack = new char[20];
    static int top = -1;

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top == 19;
    }

    static char peek() {
        return stack[top];
    }

    static char pop() {
        if (isEmpty()) return '#';  // '#' means error or empty
        char ch = stack[top];
        top--;
        return ch;
    }

    static void push(char ch) {
        if (isFull()) {
            System.out.println("Stack is Full!");
        } else {
            top++;
            stack[top] = ch;
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

    static void convertInfixToPostfix(char[] expr) {
        String result = "";
        for (int i = 0; i < expr.length; i++) {
            char ch = expr[i];

            if (isOperand(ch)) {
                result += ch;
            } else if (ch == '(') {
                push(ch);
            } else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    result += pop();
                }
                if (!isEmpty() && peek() == '(') {
                    pop();
                }
            } else {
                while (!isEmpty() && precedence(ch) <= precedence(peek())) {
                    result += pop();
                }
                push(ch);
            }
        }

        while (!isEmpty()) {
            result += pop();
        }

        System.out.println("Postfix Expression: " + result);
    }

    public static void main(String[] args) {
        String expression = "((a+(b*c))-d)";
        convertInfixToPostfix(expression.toCharArray());
    }
}
