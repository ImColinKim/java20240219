package ch04.lecture;

public class C08SwitchExpression {
	public static void main(String[] args) {
		String city = "서울";

		String area = switch(city) {
			case "서울","도쿄" -> "아시아";
			case "런던","파리" -> "유럽";
			default -> "기타 지역";
		};

		System.out.println("area = " + area);

		System.out.println(city + "은 " + switch (city) {
			case "서울", "도쿄" -> "아시아";
			case "런던","파리" -> "유럽";
			default -> "기타 지역";
		} + "에 있습니다.");
	}
}
