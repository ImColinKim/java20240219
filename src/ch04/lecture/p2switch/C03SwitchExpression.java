package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C03SwitchExpression {
	public static void main(String[] args) {
		 //switch expression : java 12 이후

		int value = 1;

		switch (value) {
			case 1 -> System.out.println("statement 1");
			case 2 -> System.out.println("statement 2");
			case 3 -> {
				System.out.println("statement 3");
				System.out.println("statement 4");
			}
			case 4 -> System.out.println("statement 5");
		}
	}

	public static class C08RPSSwitch {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();

			String userInput;
			int user;
			int computer;

			while (true) {
				System.out.println("가위(1), 바위(2), 보(3)를 선택하세요. 게임을 그만두려면 q를 입력하세요.");
				userInput = scanner.next();

				if (userInput.equalsIgnoreCase("q")) {
					break;
				}

				try {
					user = Integer.parseInt(userInput);

					if (user < 1 || user > 3) {
						System.out.println("잘못된 입력입니다. 1, 2, 3 중 하나를 입력하세요.");
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("잘못된 입력입니다. 숫자를 입력하거나 'q'를 입력하여 종료하세요.");
					continue;
				}

				computer = random.nextInt(1, 3) ;

				System.out.println("user = " + user);
				System.out.println("computer = " + computer);

				switch(user) {
					case 1 -> System.out.println("가위✌️");
					case 2 -> System.out.println("바위✊");
					case 3 -> System.out.println("보🖐️");
				}

				switch(computer) {
					case 1 -> System.out.println("가위✌️");
					case 2 -> System.out.println("바위✊");
					case 3 -> System.out.println("보🖐️");
				}

				if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
					System.out.println("당신이 이겼습니다.");
				} else if (user == computer) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("당신이 졌습니다.");
				}
			}
			scanner.close();
			System.out.println("게임을 종료합니다.");
		}
	}
}

