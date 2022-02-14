package com.moshjava;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for( char ch: input.toCharArray()) {
            if(isLeftBrackets(ch))
                stack.push(ch);
            if(isRightBrackets(ch)) {
                if(stack.empty()) return false;
                if (bracketMatch(stack.pop(), ch));
            }
        }
        return stack.empty();
    }

    private boolean isLeftBrackets (char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRightBrackets (char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private boolean bracketMatch (char left, char right) {
        return (right == ')' &&  left != '(') ||
               (right == '}' &&  left != '{') ||
               (right == ']' &&  left != '[') ||
               (right == '>' &&  left != '<');
    }
}
