import java.util.Stack;
public class p27{
    static boolean isOperand(char ch) {
        return Character.isLetter(ch);
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
    static String reverseAndSwapBrackets(String exp) {
        StringBuilder result = new StringBuilder();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '(')
                result.append(')');
            else if (ch == ')')
                result.append('(');
            else
                result.append(ch);
        }
        return result.toString();
    }

    
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (isOperand(ch)) {
                result.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
            }
            else { 
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                    result.append(stack.pop());
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }

    static String infixToPrefix(String exp) {
        exp = reverseAndSwapBrackets(exp);       
        String postfix = infixToPostfix(exp);    
        return new StringBuilder(postfix).reverse().toString(); 
    }

    public static void main(String[] args) {
        String infix = "((a/b)+c)-(d+(e*f))";
        System.out.println("The infix is: " + infix);
        String prefix = infixToPrefix(infix);
        System.out.println("The prefix is: " + prefix);
    }
}
