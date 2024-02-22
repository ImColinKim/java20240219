package c03.lecture.p1arithemetic.c03.lecture;

public class C01Assignment {
	public static void main(String[] args) {
		// assignment operator (할당연산자, 대입연산자)
		// 기호: =
		// 오른쪽 값을 왼쪽에 대입(할당, assign)
		// 연산 순서는 오른쪽 부터
		// 우선 순위가 매우 낮다
		int a = 3;
		int b = 5;
		int c = b;
		System.out.println("c = " + c);
		int d = c = 7;
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}
}
