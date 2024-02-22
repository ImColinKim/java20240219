package ch03.c03.lecture;

public class C05ShortCircuit {
	public static void main(String[] args) {
		int i = 10;

		boolean b = (i++) == 10 || (i++) == 30;
		System.out.println("b = " + b);
		System.out.println("i = " + i);

		i = 10;
		boolean c = (i++) == 30 || (i++) == 10;
		System.out.println("c = " + c);
		System.out.println("i = " + i);

		i = 10;
		boolean d = (i++) == 10 | (i++) == 30;
		System.out.println("d = " + d);
		System.out.println("i = " + i);

		i = 10;
		boolean e = (i++) == 10 || (i++) == 30;
		System.out.println("e = " + e);
		System.out.println("i = " + i);
	}
}
