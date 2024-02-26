package c03.lecture.p1arithemetic;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요: ");
		double num1 = sc.nextDouble();

		System.out.println("두 번째 숫자를 입력하세요: ");
		double num2 = sc.nextDouble();

		System.out.println("연산자를 입력하세요 (+, -, *, /): ");
		String ar = sc.next();

		double result = 0;
		 if (ar.equals("+")) {
			 result = num1 + num2;
		 } else if (ar.equals("-")) {
			 result = num1 - num2;
		 } else if (ar.equals("*")) {
			 result = num1 * num2;
		} else if (ar.equals("/")) {
			 if(num2 == 0){
				 System.out.println("분모는 0이 될 수 없습니다.");
				 return;
			 }
			 result = num1 / num2;
			 String str = "나머지는" + num1%num2 + "입니다.";
			 } else {
			 System.out.println("잘못된 연산자입니다");
			 return;
		 }

		System.out.println("result = " + result);
	}
}