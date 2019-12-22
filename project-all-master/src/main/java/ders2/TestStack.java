package ders2;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        if (stack.empty()) System.out.println("Stack is empty...");


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("size:" + stack.size());
        System.out.println(stack.elementAt(3));
        System.out.println("size:" + stack.size());
    }

}
