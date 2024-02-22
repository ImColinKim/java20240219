package ch04.sec02;

import java.util.Random;

public class IfNestedExample2 {
	public static void main(String[] args) {
		Random random = new Random();
		int score = random.nextInt(1, 20);

		String grade;

		if (score>=90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}	else {
				if(score >= 85 ) {
						grade = "B+";
				} else {
						grade= "B";
				}
		}
		System.out.println("학점 = " + grade);
	}
}
