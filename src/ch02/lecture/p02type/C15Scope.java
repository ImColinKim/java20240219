package ch02.lecture.p02type;
public class C15Scope {
	public static void main(String[] args) {
//		변수는 선언된 블럭({}) 안에서만 사용 가능(=let in java)
		int a = 3;
		System.out.println(a);
		a++;
		int c = a;
		System.out.println(c);

		if (true) {
			int b = 5;
			System.out.println("if 안");
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println("if 밖");
		System.out.println(a);
//		System.out.println(b);
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
			int v3 = v1 + v2 + 5;
			System.out.println(v2);
			System.out.println(v3);
		}

	}
}

