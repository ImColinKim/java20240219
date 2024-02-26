package ch04.exercise;

public class Exercise01 {
	public static void main(String[] args) {
		int score1 = 0;
		String grade = "B";

		switch (grade) {
			case "A" -> score1 = 100;
			case "B" -> {
				int result = 100 - 20;
				score1 = result;
			}
			default -> score1 = 60;
		}
		System.out.println(score1);
	}
}