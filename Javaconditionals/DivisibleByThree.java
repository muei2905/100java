package Javaconditionals;

import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("Chia hết cho 3");
        } else {
            System.out.println("Không chia hết cho 3");
        }
    }
	}

