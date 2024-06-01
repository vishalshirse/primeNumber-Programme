package Assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			if (r % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

}
