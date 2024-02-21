package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C12StringTemplete {
	public static void main(String[] args) {
		// java 21부터?
		String name = "jane";
		String age = "50";
		// 1번 방법
		String desc = "My name is " + name + " and age is " + age;
		System.out.println(desc);
		// 2번 방법
		String desc2 = String.format("My name is %s and age is %s", name, age);
		System.out.println(desc2);
		// 3번 방법 (새로운 방법)
		String desc3 = STR."my name is \{name} and age is \{age}";
		System.out.println(desc3);

		String address = "서울";
		String country = "한국";

		String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다";
		System.out.println(desc4);
	}

	}
