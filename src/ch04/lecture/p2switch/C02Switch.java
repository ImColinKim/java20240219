package ch04.lecture.p2switch;

public class C02Switch {
	public static void main(String[] args) {
		System.out.println("statement 1");

		String city = "Seoul";

		switch (city) {
			case "Seoul":
			System.out.println("statement 2");
			break;

			case "Busan":
			System.out.println("statement 3");
			break;

			case "Jeju":
			System.out.println("statement 4");
			break;
		}

		System.out.println("statement 5");

	}
}
