package Javadatastructures;

public class SieveOfEratosthenesExample {
	public static void sieveOfEratosthenes(int n) {
		  boolean[] isPrime = new boolean[n + 1];
		  for (int i = 2; i <= n; i++) {
		  	isPrime[i] = true;
		  }
		  for (int i = 2; i * i <= n; i++) {
		  	if (isPrime[i]) {
		  for (int j = i * i; j <= n; j += i) {
		  	isPrime[j] = false;
		  		}
		 	}
		  }
		  int largestPrime = -1;
		  for (int i = n; i >= 2; i--) {
		  		if (isPrime[i]) {
		  			largestPrime = i;
		 			 break;
		  		}
		        }
		        if (largestPrime != -1) {
		           System.out.println("Số nguyên tố lớn nhất trong đoạn " + n + " là: " + largestPrime);
		        } else {
		          System.out.println("Không có số nguyên tố nào trong đoạn " + n);
		        }
		  }
	public static void main(String[] args) {
		int n = 20;
	  	sieveOfEratosthenes(n);
	}
}
