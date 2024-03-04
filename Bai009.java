import java.util.Arrays;

public class Bai009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 35, -15, 7, 55, 1, -22};
	    int element = 55;
	    boolean isFound = Arrays.stream(numbers).anyMatch(i -> i == element);
	    if (isFound) {
	      System.out.println(element + " is found in the array");
	    } else {
	      System.out.println(element + " is not found in the array");
	    }
	}

}
