package Javaconditionals;

import java.util.Scanner;

public class NamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một năm: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Không phải năm nhuận");
        }
	}

}
