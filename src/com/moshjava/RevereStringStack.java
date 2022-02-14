package com.moshjava;

import java.util.Stack;

public class RevereStringStack {
    public static  String reverseString(String input) {

        if(input == null)
            throw new IllegalArgumentException();
        
        Stack<Character> stack = new Stack<>();
        for( char ch: input.toCharArray())
            stack.push(ch);

        StringBuffer reverseString = new StringBuffer();
        while(!stack.empty())
            reverseString.append(stack.pop());

        return reverseString.toString();
    }

    public static String reverseStringPointer(String input) {
        var s = input.toCharArray();
        int start = 0;
        int end = s.length -1;
        Stack<Character> stack = new Stack<>();
        while(start < end) {
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;

        }
        for( char ch: s)
            stack.push(ch);

        StringBuffer reverseString = new StringBuffer();
        while(!stack.empty())
            reverseString.append(stack.pop());

        return reverseString.toString();
    }

    public static void main(String[] args) {
        var result = reverseStringPointer("AminulHoque");
        System.out.println("Reverse String: " + result);
    }
}


