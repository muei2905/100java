package Loopjava;

public class Fibonaci100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c;
		System.out.print(a + " " + b);
		for (int i = 2; i < 100; i++) {
		    c = a + b;
		    if (c >= 100) {
		        break;
		    }
		    System.out.print(" " + c);
		    a = b;
		    b = c;
		}
	}

}
