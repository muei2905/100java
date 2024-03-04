
public class Bai005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 35, -15, 7, 55, 1, -22};
	    for (int i = 0; i < numbers.length; i++) {
	      for (int j = i + 1; j < numbers.length; j++) {
	        if (numbers[i] > numbers[j]) {
	          int temp = numbers[i];
	          numbers[i] = numbers[j];
	          numbers[j] = temp;
	        }
	}

	    }
	}
}
