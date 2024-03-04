
public class Bai007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 24;
	    int num2 = 16;
	    while (num1 != num2) {
	      if (num1 > num2) {
	        num1 = num1 - num2;
	      } else {
	        num2 = num2 - num1;
	      }
	    }
	    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + num1);

	}

}
