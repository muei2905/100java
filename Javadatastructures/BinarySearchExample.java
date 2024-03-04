package Javadatastructures;

public class BinarySearchExample {
	public static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int index = binarySearch(numbers, target);
        if (index != -1) {
            System.out.println("Số " + target + " tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Số " + target + " không tìm thấy trong mảng.");
        }
	}
}
