package c02.lecture.p02type;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C27Print {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		System.out.print(a);
		System.out.printf("%d은 %s", a, "10");

		Scanner scanner = new Scanner(System.in);
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y값 입력 ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("x+y: " + result);
		System.out.println();

		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("quit")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");



	}

}