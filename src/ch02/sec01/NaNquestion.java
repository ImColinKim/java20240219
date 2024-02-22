package ch02.sec01;

public class NaNquestion {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 1.0;
		double z = 5 % y;

		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println(z + 2);
		}

		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println("result = " + result);
	}
}



