package ch04.exercise;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		int deposit = 1000000;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택");

			int i = scanner.nextInt();

			switch (i) {
				case 1 -> {
					System.out.println("얼마나 입금할까요?");
					i = scanner.nextInt();
					deposit = deposit + i;
					System.out.println("잔고는 " + (deposit) + "원 입니다.");
				}
				case 2 -> {
					System.out.println("얼마를 출금할까요?");
					i = scanner.nextInt();
					deposit = deposit - i;
					System.out.println("잔고는 " + (deposit) + "원 입니다.");
				}
				case 3 -> {
					System.out.println("잔고는" + deposit + "원입니다.");
				}
				case 4 -> {
					System.out.println("종료합니다.");
					scanner.close();  // Scanner 객체 닫기
					return;
				}

				default -> System.out.println("다시 확인해 주세요.");
			}
		}
	}
}
