package Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static String ToPostfix(String infix) { //12+3/4
        String Postfix = "";
        Stack<Character> s = new Stack<>();
        String[] arr = infix.split(" ");  // [12+3/4]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 1 || Character.isDigit(arr[i].charAt(0))) {
                Postfix += arr[i] + " ";
            } else {
                char c = arr[i].charAt(0);
                if (s.isEmpty() || c == '(') {
                    s.push(c);
                } else {
                    switch (c) {
                        case '*':
                        case '/':
                            if (s.peek() != '*' || s.peek() != '/') {
                                s.push(c);
                            } else {
                                Postfix += s.pop() + " ";
                                s.push(c);
                            }
                            break;
                        case '+':
                        case '-':
                            if (s.isEmpty() || s.peek() == '(') {
                                s.push(c);
                            } else {
                                while (!s.isEmpty() || s.peek() != '(') {
                                    Postfix += s.pop() + " ";
                                }
                                s.push(c);
                            }
                            break;
                        case ')':
                            while (!s.isEmpty()) {
                                if (s.peek() == ')') {
                                    s.pop();
                                    break;
                                }
                                Postfix += s.pop() + " ";
                            }
                            break;
                    }

                }

            }

        }
        while (!s.isEmpty()) {
            Postfix += s.pop() + " ";
        }

        return Postfix;
    }

    
    // *********************Infix To Prefix **************************************
    
    
    
    
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public static int getPrecedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // infix  To Prefix  
    //12 + 4 * ( 8 - 5 ) 
    /*
    Infix :  12 + 3 / 4      
    reverce : 4 / 3 + 12 
    Topostfix() 
    
     */
    public static String ToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = new StringBuilder(infix).reverse().toString();
        
        // Initialize the stack and the prefix expression
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();
        
        // Traverse the reversed infix expression
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            
            // If the character is an operand, add it to the prefix expression
            if (!isOperator(c)) {
                prefix.append(c);
            }
            // If the character is an operator, push it to the stack
            else {
                while (!stack.isEmpty() && getPrecedence(stack.peek()) > getPrecedence(c)) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }
         // Pop the remaining operators from the stack and add them to the prefix expression
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }
        
        // Reverse the prefix expression to get the final result
        return prefix.reverse().toString();
        
 
    }

    
    
    
  

    public static void main(String[] args) {

        String s = ToPostfix("12 + 3 / 4");
        System.out.println(s);
        System.out.println(ToPostfix("12 + 4 * ( 5 - 8 )"));
        
        System.out.println(ToPrefix("10 + 3 * 5"));
        
       
       
    }

}
