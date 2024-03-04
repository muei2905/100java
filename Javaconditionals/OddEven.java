package Javaconditionals;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
	}

}
