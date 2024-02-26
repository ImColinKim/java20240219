package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 / 2. 감속 / 3. 중지");
			System.out.println("-------------------------");
			System.out.println("선택");

			String strNum = sc.nextLine();

			switch (strNum) {
				case "1" -> {speed++;
				System.out.println("현재 속도 = " + speed);}
				case "2" -> {speed--;
					System.out.println("현재 속도 = " + speed);}
				case "3" -> run = false;
				default -> System.out.println("유효하지 않은 값");
			}
		}
		System.out.println("프로그램 종료");
	}
}
