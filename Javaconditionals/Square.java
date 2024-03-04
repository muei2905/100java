package Javaconditionals;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println("Bình phương của số " + num + " là " + square);
	}

}
