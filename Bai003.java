
public class Bai003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 35, -15, 7, 55, 1, -22};
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < numbers.length; i++) {
	      if (numbers[i] > max) {
	        max = numbers[i];
	      }
	    }
	    System.out.println("Max number in array is: " + max);
	}

}
