package Javaconditionals;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Nhập vào số nguyên (0 để dừng): ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Tổng của dãy số: " + sum);
	}

}
