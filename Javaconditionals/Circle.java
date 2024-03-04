package Javaconditionals;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn: ");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Chu vi hình tròn là " + circumference);
        System.out.println("Diện tích hình tròn là " + area);
	}

}
