import java.util.Scanner;

public class ExerciseWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.println("정수 입력");
			int i = scanner.nextInt();

			if (i==0) {
				break;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
