package Loopjava;

public class Maxloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 3, 8, 9, 2};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > max) {
		        max = arr[i];
		    }
		}
		System.out.println("Số lớn nhất là: " + max);

	}

}
