package even;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num = scan1.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}

}
