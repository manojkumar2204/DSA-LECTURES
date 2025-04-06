public class p26 {

    static final int MAX = 100;
    static int top = -1;
    static char[] stack = new char[MAX];

    static boolean isFull() {
        return top == MAX - 1;
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void push(char item) {
        if (isFull())
            return;
        stack[++top] = item;
    }

    static char pop() {
        if (isEmpty())
            return '#'; 
        return stack[top--];
    }

    static char peek() {
        if (isEmpty())
            return '#';
        return stack[top];
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

    static void getPostfix(char[] exp) {
        int i, j;
        char[] result = new char[exp.length];
        j = -1;

        for (i = 0; i < exp.length && exp[i] != '\0'; i++) {
            char ch = exp[i];

            if (isOperand(ch)) {
                result[++j] = ch;
            } else if (ch == '(') {
                push(ch);
            } else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    result[++j] = pop();
                }
                if (!isEmpty() && peek() == '(')
                    pop();
            } else { 
                while (!isEmpty() && precedence(ch) <= precedence(peek())) {
                    result[++j] = pop();
                }
                push(ch);
            }
        }

        while (!isEmpty()) {
            result[++j] = pop();
        }

        result[++j] = '\0';

    
        for (i = 0; i < j; i++) {
            exp[i] = result[i];
        }
        exp[i] = '\0';
    }

    static void reverse(char[] exp) {
        int i = 0, j = exp.length - 2;
        while (i < j) {
            char temp = exp[i];
            exp[i] = exp[j];
            exp[j] = temp;
            i++;
            j--;
        }
    }

    static void changeBrackets(char[] exp) {
        for (int i = 0; i < exp.length && exp[i] != '\0'; i++) {
            if (exp[i] == '(')
                exp[i] = ')';
            else if (exp[i] == ')')
                exp[i] = '(';
        }
    }

    static void infixToPrefix(char[] exp) {
        reverse(exp);
        changeBrackets(exp);
        getPostfix(exp);
        reverse(exp);
    }

    public static void main(String[] args) {
        System.out.print("The infix is: ");
        String expression = "((a/b)+c)-(d+(e*f))";
        System.out.println(expression);

        char[] exp = new char[MAX];
        System.arraycopy(expression.toCharArray(), 0, exp, 0, expression.length());
        exp[expression.length()] = '\0';

        infixToPrefix(exp);

        System.out.print("The prefix is: ");
        for (int i = 0; exp[i] != '\0'; i++) {
            System.out.print(exp[i]);
        }
        System.out.println();
    }
}
