package Javaconditionals;

import java.util.Scanner;

public class CheckAmDuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iScanner = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen:");
		int x;
		x= iScanner.nextInt();
		if(x>=0)
			System.out.print("So Duong");
		else 
			System.out.print("So Am");
	}

}
