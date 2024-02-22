package ch04.lecture.p2switch;

import java.util.Random;

public class C01Switch {
	public static void main(String[] args) {

		System.out.println("전국일주 시작");

		String[] cities = {"서울", "제주", "부산", "인천", "대구", "대전", "광주", "전주", "경기","집"};

		Random random = new Random();

		int index = random.nextInt(cities.length);
		String city = cities [index];

		switch (city){
			case "서울":
			System.out.println("여기는 서울입니다.");
			break;

			case "제주":
			System.out.println("여기는 제주입니다.");
			break;

			case "부산":
			System.out.println("여기는 부산입니다.");
			break;

			case "인천":
			System.out.println("여기는 인천입니다.");
			break;

			case "대구":
				System.out.println("여기는 대구입니다.");
			break;

			case "대전":
				System.out.println("여기는 대전입니다.");
				break;

			case "광주":
			System.out.println("여기는 광주입니다.");
			break;

			case "전주":
			System.out.println("여기는 전주입니다.");
			break;

			case "경기":
			System.out.println("여기는 경기입니다.");
			break;

			default:
				System.out.println("저는 지금 집에 있어요");
			break;
		}
	}
}