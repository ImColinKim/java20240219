package ch04.lecture;

public class C09Yield {
	public static void main(String[] args) {
		String city = "paris";
		String area = switch (city) {
			case "seoul", "tokyo" -> "asia";
			case "london", "paris" -> {
				yield "europe"; // yield를 사용해 값을 반환
			}
			default -> "etc.";
		};
		System.out.println("area = " + area);

		String shape = "원"; // 'length' 대신 사용할 'shape' 변수를 정의
		double length = 5.0; // 원의 반지름이나 정사각형의 한 변의 길이
		double result = switch (shape) {
			case "원" -> 3.14 * length * length; // 원의 면적 계산
			case "정사각형" -> length * length; // 정사각형의 면적 계산
			default -> 0.0;
		};
		System.out.println("result = " + result);
	}
}
