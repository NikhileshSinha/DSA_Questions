class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0 || tokens == null)
            return -1;
        
        Stack<Integer> stack = new Stack<Integer>();

        for (String token : tokens) {
            int a, b;
            if (token.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if (token.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (token.equals("-")) {
                b = stack.pop();
                a = stack.pop(); 
                stack.push(a - b);
            }
            else if (token.equals("/")) {
                b = stack.pop();
                a = stack.pop(); 
                stack.push(a / b);
            }
            else
                stack.push(Integer.valueOf(token));
        }
        return stack.pop();
    }
}