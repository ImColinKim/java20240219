package c02.lecture.p02type;

import java.util.Scanner;

public class C14Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();

		System.out.println("나이를 입력하세요");
		String age = scanner.nextLine(); // 나이를 문자열로 받음. 필요에 따라 int로 변환 가능

		System.out.println("주소를 입력하세요");
		String address = scanner.nextLine();

		// Java 21 이전 버전을 위한 수정 방안
		String desc = "저는 " + address + "에 사는 " + age + "살, " + name + "입니다";

		System.out.println("소개 = " + desc);
		scanner.close();
	}
}

