package ch04.lecture;

import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class C05Random {
	public static void main(String[] args) {
		Random random = new Random();

		int dice1 = random.nextInt(1, 7);
		int dice2 = random.nextInt(1, 7);
		int dice3 = random.nextInt(1, 7);

		System.out.println("dice1 = " + dice1);
		System.out.println("dice2 = " + dice2);
		System.out.println("dice3 = " + dice3);

	}
}
