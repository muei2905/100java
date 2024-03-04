package Javaconditionals;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        int num2 = sc.nextInt();
        System.out.print("Nhập vào số nguyên thứ ba: ");
        int num3 = sc.nextInt();
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("Số lớn nhất trong 3 số là: " + largest);
	}

}
