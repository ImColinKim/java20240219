package ch04.exercise;

import java.util.Random;

public class Exercise03 {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;

		do {
			int num1 = random.nextInt(1,6);
			int num2 = random.nextInt(1,6);
			sum = num1 + num2;
			System.out.println("눈1 = " + num1 + " 눈2 = " + num2 );
			System.out.println("합은 " + sum);
		} while (!(sum == 7));
	}
}
