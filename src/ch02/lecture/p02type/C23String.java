package ch02.lecture.p02type;

public class C23String {
	public static void main(String[] args) {
		// String
		// 기본타입 <-> 참조타입 간의 Casting 을 통한 형변환은 불가하므로 Method 를 사용

		String a = "12";
		int b = Integer.parseInt(a);
		double c = Double.parseDouble(a);
//		char d = Character. 불가

		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);

		System.out.println(Boolean.parseBoolean("tRuE"));
		System.out.println(Boolean.parseBoolean("Yes"));

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str4 = Double.toString(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str3 = " + str4);
	}
	}

