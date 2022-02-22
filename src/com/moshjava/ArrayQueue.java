package com.moshjava;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int front;
    private int count;
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(count == items.length) throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(6);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        var front = queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println(front);
        System.out.println(queue);
    }
}
