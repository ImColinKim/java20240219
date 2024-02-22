package c03.lecture.p1arithemetic.c03.lecture;

public class C06TernaryOperator {
	public static void main(String[] args) {
		// 삼항연산자(Ternary Operator, 조건연산자, Conditional operator)
		// 피연산자 갯수: 3개
		// 첫번째 피연산자의 타입 : boolean
		// 다른 두 피연산자의 타입은 같아야 함

		//기호
		// ? :

		int a = true?1:2;
		System.out.println("a = " + a);
		int b = false?1:2;
		System.out.println("b = " + b);

		int age = 30;
		String c = (age>=20)?"어른":"아이";
		System.out.println("c = " + c);

		age = 15;
		String d = (age>=20)?"어른":"아이";
		System.out.println("d = " + d);
	}
}
