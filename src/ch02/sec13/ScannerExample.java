package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력:");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("result = " + result);

        System.out.println();


        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) { // data 가 "q"이면
                break;
            }

            System.out.println("data = " + data);
            System.out.println();
        }

        scanner.close();
    }
}
