package org.stack;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem_155_Min_Stack {


    Stack<Integer> minStack ;
    int min = Integer.MAX_VALUE;
    public Problem_155_Min_Stack() {
        minStack =new Stack<Integer>();
    }

    public void push(int val) {

        if(val <= min || min == Integer.MIN_VALUE){
           minStack.add(min);
            min = val;
        }
        minStack.add(val);

    }

    public void pop() {
        int top = minStack.peek();
        if(top == min){
            minStack.pop();
            min = minStack.peek();

        }
       minStack.pop();
    }

    public int top() {
       // if(!values.isEmpty() )
            return minStack.peek();


    }

    public int getMin() {
            return min;
    }




    public static void main(String[] args){

     /*   Problem_155_Min_Stack minStack = new Problem_155_Min_Stack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());  // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2*/


        Problem_155_Min_Stack minStack2 = new Problem_155_Min_Stack();
        minStack2.push(0);
        minStack2.push(1);
        minStack2.push(-0);
        System.out.println(minStack2.getMin());  // return -3
        minStack2.pop();
        System.out.println(minStack2.getMin());



    }
}
