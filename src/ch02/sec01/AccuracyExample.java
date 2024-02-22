package ch02.sec01;

public class AccuracyExample {
	public static void main(String[] args) {
		int totalPieces = 10; // 사과 한 개를 열 조각으로 나눔
		int eatenPieces = 7; // 먹은 조각 수

		// 정확한 계산을 위해 정수형으로 계산 후, 결과를 double로 변환하여 소수점 이하 자리를 표현
		double remainingPieces = totalPieces - eatenPieces; // 남은 조각 수 계산
		double remainingApple = (double) remainingPieces / 10.0; // 0.3개의 사과로 표현

		System.out.println("남은 사과: " + remainingApple);
	}
}