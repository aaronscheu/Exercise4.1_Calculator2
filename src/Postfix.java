//import org.jetbrains.annotations.Contract;

/**
 * Created by amaridev on 05/12/15.
 * Package: PACKAGE_NAME for Exercise3.2_PostfixStack.
 */
public class Postfix {

    public Postfix() {
    }

    public int evaluate(String pfx, boolean hex) throws Exception {
        Stack<Integer> stack = new Stack<>();
        String[] split = pfx.split(" ");
        int op1, op2;

        for (String st : split) {
            if (isOperand(st)) {
                if (!hex) {
                    stack.push(Integer.parseInt(st));
                } else {
                    stack.push(Integer.decode("#" + st));
                }
            } else {
                op2 = stack.pop();
                op1 = stack.pop();

                stack.push(calcResult(op1, op2, st.toCharArray()[0]));
            }
        }

        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            throw new Exception("Wrong formated String");
        }
    }


    private int calcResult(int op1, int op2, char c) throws Exception{

        switch (c) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': return op1 / op2;
            case '^': return (int) (Math.pow(op1, op2));
            default: throw new Exception("Unkown Operand");
        }
    }


    public String in2Postfix(String expression) {
        Stack<String> stack = new Stack<>();
        String[] split = expression.split(" ");
        String output = "";

        for (String st : split) {

            if (isOperand(st))
                output += st + " ";

            else if (st.equals("(")) stack.push(st);

            else if(st.equals(")")) {
                while(!stack.isEmpty() && !stack.top().equals("(")) output += stack.pop() + " ";
                stack.pop();
            }

            else {
                while(!stack.isEmpty() && isLowPrio(stack.top(), st)) {
                    output += stack.pop() + " ";
                }
                stack.push(st);
            }
        }
        while (!stack.isEmpty()) output += stack.pop() + " ";
        return output;
    }


    //@Contract(pure = true)
    private boolean isOperand(String c) {
        return c.matches("\\w+");
    }

    //@Contract(pure = true)
    private int getOperatorWeight(char op) {
        switch(op) {
            case '(': return 0;
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    private boolean isLowPrio(String op1, String op2) {
        int op1w = getOperatorWeight(op1.charAt(0));
        int op2w = getOperatorWeight(op2.charAt(0));

        return op1w == op2w || op1w > op2w;
    }
}
