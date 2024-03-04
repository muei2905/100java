package Javadatastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
        // Thêm các phần tử vào queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // In ra các phần tử trong queue
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
	}

}
