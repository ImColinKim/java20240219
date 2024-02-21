package c02.lecture.p02type;

public class C25Operation {
	public static void main(String[] args) {
		// Integer 연산 결과는 정수
		int a = 10;
		int b = 2; 
		int c = a/b; // 5
		System.out.println("c = " + c);

		int d = 10;
		int e = 3;
		double f = d/e ;
		System.out.println("f = " + f);
		
		double g = (double)d/e;
		System.out.println("g = " + g);
	}
}
