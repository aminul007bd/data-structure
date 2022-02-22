package com.moshjava;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        var first = queue.dequeue();
        System.out.println(first);
    }
}
