package Javaconditionals;

import java.util.Scanner;

public class SoSanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iScanner = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen thu nhat:");
		int x, y;
		x= iScanner.nextInt();
		System.out.print("Nhap vao so nguyen thu hai:");
	    y= iScanner.nextInt();
	    if(x>y)
	    	System.out.print("So Lon Hon !");
	    else if(x<y)
	    	System.out.print("So Nho Hon !");
	    else 
	    	System.out.print("Hai So Bang Nhau !");
	}

}
