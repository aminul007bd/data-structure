package com.moshjava;

import java.util.Stack;

public class QueueUsingStack {
    private  Stack<Integer> s1 = new Stack<>();
    private  Stack<Integer> s2 = new Stack<>();

    // O(1)
    public void enqueue (int item) {
        s1.push(item);
    }

    //O(n)
    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();
        MoveStack1ToStack2();
        return s2.pop();
    }    
    
    //O(n)
    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();
        MoveStack1ToStack2();
        return s2.peek();
    }

    private void MoveStack1ToStack2() {
        if(s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
