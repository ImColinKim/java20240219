package ch04.exercise;

public class Exercise04 {
	public static void main(String[] args) {

		int x, y;
		int sum;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				sum = 4 * x + 5 * y;
				if (sum == 60) {
					System.out.println("x는 " + x + " y는 " + y);
					break;
				}
			}
		}
	}
}
