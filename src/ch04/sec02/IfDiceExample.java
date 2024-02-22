package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		int dice1 = (int) ((Math.random() * 6) + 1);


		if (dice1 == 1) {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		} else if (dice1 == 2) {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		} else if (dice1 == 3) {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		} else if (dice1 == 4) {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		} else if (dice1 == 5) {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		} else {
			System.out.println("주사위 눈금은 " + dice1 + "입니다.");
		}
	}



}

