package ch04.lecture;

public class C02Else {
	public static void main(String[] args) {
		//Else : if의 조건이 false일때 실행되는 코드 블럭

		int condition = 40;

		if (condition>100) {
			System.out.println("statement 1");
			System.out.println("statement 2");
		} else if (condition<100&&condition>50){
			System.out.println("statement 3");
			System.out.println("statement 4");
		} else {
			System.out.println("statement 5");
			System.out.println("statement 6");
		}
	}
}
