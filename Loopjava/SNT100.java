package Loopjava;

public class SNT100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 100; i++) {
		    boolean isPrime = true;
		    for (int j = 2; j <= i / 2; j++) {
		        if (i % j == 0) {
		            isPrime = false;
		            break;
		        }
		    }
		    if (isPrime) {
		        System.out.print(i + " ");
		    }
		}
	}

}
