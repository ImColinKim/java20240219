package ch04.lecture.p3while;
public class C03Debug {
	public static void main(String[] args) {
		//debug 실행: shift f9
		// 다음 break point 까지 실행 f9
		// 다음 명령문 실행 f8

		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		System.out.println("statement 4");
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");

		int i = 1;

		while (i <= 7) {
			if (i == 3) {
				i++; // 먼저 i 값을 증가시킴
				continue; // 그리고 continue 문으로 현재 반복을 건너뛰기
			}
			System.out.println("statement " + i);
			i++; // 다른 경우에는 정상적으로 출력 후 i 값을 증가시킴
		}
	}
}
