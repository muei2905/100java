
public class Bai006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 10;
	    String binary = "";
	    while (decimal > 0) {
	      binary = (decimal % 2) + binary;
	      decimal = decimal / 2;
	    }
	    System.out.println("Binary representation of " + decimal + " is: " + binary);
	  }
	}


