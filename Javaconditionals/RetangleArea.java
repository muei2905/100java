package Javaconditionals;

import java.util.Scanner;

public class RetangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        double length = sc.nextDouble();
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Diện tích hình chữ nhật là " + area);
	}

}
