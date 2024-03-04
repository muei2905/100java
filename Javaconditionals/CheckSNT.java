package Javaconditionals;

import java.util.Scanner;

public class CheckSNT {

	public static boolean checkSNT(int a)
	{
		if(a<2)
			return false;
		if(a==2)
			return true;
		else {
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
					return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iScanner = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen:");
		int x;
		x= iScanner.nextInt();
		if(checkSNT(x))
			System.out.print("So Nguyen To");
		else
			System.out.print("Khong Phai So Nguyen To");
	}

}
