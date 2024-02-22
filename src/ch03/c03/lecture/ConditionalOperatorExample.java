package ch03.c03.lecture;

public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90)?'A':(score>80)?'B':'C';
		System.out.println(score+ "점은 " + grade + "학점입니다.");

		int score1 = 95;
		char grade1 = ' ';
		if (score1>90) {
			grade1 = 'A';
		} else if (score1>80) {
			grade1 = 'B';
		} else {
			grade1 = 'C';
		}
		System.out.println(score1+ "점은 " + grade1 + "학점입니다.");
	}
}
