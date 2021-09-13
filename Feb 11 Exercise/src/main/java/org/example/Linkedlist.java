package org.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(12);
        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack);

        Queue<Integer> queue =new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();
        System.out.println(queue);

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println(priorityQueue);
    }
}
