package c02.sec01;

public class codetest1 {
	public static void main(String[] args) {
			int age = 40;
				if (age < 0 || age > 120) {
					System.out.println("부적절한 값입니다.");
				} else {
					int currentYear = 2022;
					int answer = currentYear - age + 1;
					System.out.println(String.format("2022년 기준 %d세이므로 %d년생입니다.", age, answer));
				}
			}
		}

