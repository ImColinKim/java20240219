package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		String a = "hello";
		String b = "my name is \"John\"";
		String c = "It is line one \n It is line two";
		System.out.println(a+b+c);

		String name = "홍길동";
		String job = "프로그래머";
		System.out.println("name = " + name);
		System.out.println("job = " + job);

		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println("str = " + str);

		str = "번호\t이름\t직업";
		System.out.println("str = " + str);

		System.out.println("나는\n자바를\n배웁니다.");
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.\n");
	}

	}
