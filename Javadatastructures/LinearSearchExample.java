package Javadatastructures;

public class LinearSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 2, 9, 1, 3};
        int target = 9;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Số " + target + " tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Số " + target + " không tìm thấy trong mảng.");
        }
	}

}
