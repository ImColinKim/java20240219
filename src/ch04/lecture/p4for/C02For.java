package ch04.lecture.p4for;

public class C02For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("some statement...");
		}

		for (int i = 5; i > 0; i--) {
			System.out.println("other statement!!!");
		}

		for (int i = 0; i < 10 ; i += 2) {
			System.out.println("another statement@@@");
		}

		for (int i = 0, j = 5 ; i < 3 ; i++, j--) {
			System.out.println("the others ###");
		}

		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("nested $$$");
			}
		}
	}
}
