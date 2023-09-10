package com.moshjava;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.peek();
        var top = stack.pop();
        System.out.println(stack.search(80));

    }
}
