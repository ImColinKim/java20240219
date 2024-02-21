package c02.lecture.p02type;

public class C28Printf {
	public static void main(String[] args) {
		// System.out.printf()
		System.out.printf("Hello World");
		System.out.println();
		String str1 = "영수";
		System.out.printf("Hello %s World %s", str1, "!");

		// Java 21
		System.out.println();

		String a = "son";
		String b = "Park";
		System.out.println(STR."hello \{a} and \{b}");

		System.out.printf("%3$s %2$s - %1$s", "kang", "in", "lee");

	}
}
