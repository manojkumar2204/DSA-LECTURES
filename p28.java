import java.util.Stack;
public class p28 {
    static boolean isOperand(char c) {
        return Character.isDigit(c);
    }
    static double evaluatePrefix(String expr) {
        Stack<Double> stack = new Stack<>();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);
            if (isOperand(ch)) {
                stack.push((double) (ch - '0')); 
            }
        
            else {
                double op1 = stack.pop();
                double op2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                    default:
                        System.out.println("Invalid Operator");
                        return Double.NaN;
                }
            }
        }

        return stack.peek();
    }

    
    public static void main(String[] args) {
        String expr = "+9*26"; 
        System.out.println("Prefix Expression: " + expr);
        System.out.println("Evaluated Result: " + evaluatePrefix(expr));
    }
}
