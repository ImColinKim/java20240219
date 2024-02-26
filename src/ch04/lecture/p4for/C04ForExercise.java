package ch04.lecture.p4for;

public class C04ForExercise {
	public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
         */
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println();


        /*
        1
        2
        3
        4
        5
         */
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println();

        /*
        0
        2
        4
        6
        8
         */

		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();


        /*
        2
        4
        6
        8
        10
         */

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();

        /*
        4
        3
        2
        1
        0
         */

		for (int i = 4; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println();

        /*
        5
        4
        3
        2
        1
         */

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <=  6 - i; k++) {
				System.out.print("#");
				}
			System.out.println();
			}
		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=  6 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=  6 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		int count = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count);
				count = (count + 1) % 10;
			}
			System.out.println();
		}
		System.out.println();

		count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				count = (count + 1) % 10;
				System.out.print(count);
			}
			System.out.println();
		}
		}
	}