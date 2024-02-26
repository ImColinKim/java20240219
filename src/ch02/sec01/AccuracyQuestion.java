<<<<<<< HEAD:src/ch02/sec01/AccuracyQuestion.java
package ch02.sec01;
=======
package c02.sec01;
>>>>>>> origin/master:src/c02/sec01/AccuracyQuestion.java

public class AccuracyQuestion {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		// 3번 문제 풀이
		int pencilPerStudent = (pencils / students);
		System.out.println("pencilPerStudent = " + pencilPerStudent);

		int pencilLeft = (pencils % students);
		System.out.println("pencilLeft = " + pencilLeft);

		// 4번 문제 풀이
		int value = 356;
		System.out.println(value-value%300);
		
		// 5번 문제 풀이
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*height)/2.0;
		double area2 = (lengthTop+lengthBottom)*height/2.0;
		double area3 = (lengthTop+lengthBottom)*height*1.0/2;
		double area4 = (double)(lengthTop+lengthBottom)*height/2;
		double area5 = (double)((lengthTop+lengthBottom)*height/2);

		System.out.println("area = " + area);
		System.out.println("area2 = " + area2);
		System.out.println("area3 = " + area3);
		System.out.println("area4 = " + area4);
		System.out.println("area5 = " + area5);
	}
}
