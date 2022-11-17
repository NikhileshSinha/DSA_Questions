import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            int a, b;
            switch (ch) {
                case "+":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(a + b);
                    break;
                case "-":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b-a);
                    break;
                case "*":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(a * b);
                    break;
                case "/":
                    a = stk.pop();
                    b = stk.pop();
                    int div;
                    try {
                        div = b/a;
                    } 
                    catch (NumberFormatException e){
                        div = 0;
                    }
                    stk.push(div);
                    break;
                default:
                    int j = Integer.parseInt(ch);
                    stk.push(j);
                    break;
            }
        }
        return stk.peek();
    }
}
