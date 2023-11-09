package org.stack;


import java.util.Stack;

public class Problem20_Valid_Parentheses {


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()) {
            if (c.equals('{') || c.equals('(') || c.equals('['))
                stack.push(c);
            else {
                if (stack.empty()){
                    return false;
                }
                char top = stack.peek();
                if ((c == ')'  && top == '(')
                        || (c == '}' && top == '{')
                        || (c == ']' && top == '[')){
                    stack.pop();
                }else
                    return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[]args){
        String s = "()[](}";
        String s1 = "()";
        System.out.println(isValid(s1));

    }
}
