package ch04.lecture.p2switch;

public class C09Switch {
	public static void main(String[] args) {
		String city = "서울";

		switch (city){
			case "서울" -> System.out.println("수도권입니다.");
			case "인천" -> System.out.println("수도권입니다.");
		}

		switch (city){
			case "서울":
			case "인천":
				System.out.println("수도권입니다.");
				break;

		}
	}
}
