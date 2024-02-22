package ch04.lecture;

public class C09Yield {
	public static void main(String[] args) {

		String city = "paris";

		String area = switch (city) {
			case "seoul", "tokyo" -> "asia";
			case "london", "paris" -> {
				yield "europe";
			}
			default -> "etc.";
		};
		System.out.println("area = " + area);
		int length = 5;
		double result = switch (length) {
			case "원" -> {
				double calc = 3.14 * length*length;
				yield calc;
			}
			case "정사각형" -> length * length;
			default -> 0.0;
		};
	}
}

