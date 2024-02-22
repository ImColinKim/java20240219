package ch04.sec02;

import java.util.HashSet;
import java.util.Set;

public class UniqueRandomNumbers {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();

		// 원하는 숫자의 개수가 Set에 담길 때까지 반복
		while (numbers.size() < 6) {
			int number = (int) (Math.random() * 45) + 1;
			numbers.add(number); // Set에 숫자를 추가 (중복된 값은 자동으로 제외됨)
		}

		// 생성된 숫자 출력
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
