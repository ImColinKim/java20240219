package c02.lecture.p02type;

import java.util.Scanner;

public class C13Scaner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine(); //키보드 입력을 받음
		System.out.println("line = " + line);
		
		scanner.close();

	}

}
