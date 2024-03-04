package Javadatastructures;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
        // Thêm các phần tử vào stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // In ra các phần tử trong stack
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
	}

}
