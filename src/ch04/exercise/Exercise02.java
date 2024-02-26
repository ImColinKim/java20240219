package ch04.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i <= 100 ; i+=3) {
			sum += i;
			System.out.println("i 는" + i + " sum 은" + sum);
		}
		System.out.println(sum);
	}
}
