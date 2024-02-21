package c02.lecture.p02type;

import javax.annotation.processing.Processor;

import static java.util.FormatProcessor.FMT;

public class C29FormatString {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "무직";
		System.out.printf("%6d | %10s | %10s%n",1,name,job);
		System.out.println(STR."\{1} | \{name} | \{job}");
		//FMT Templete Processor
		System.out.println(FMT."%6d\{1} | %-10s\{name} | \{job}");

		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;

		byte result = byteValue + byteValue;

		int v1 = 1;
		System.out.println("v1: " + v1);
		if (true) {
			int v2 = 2;
			if(true) {
				int v3 = 2;
				System.out.println("v1: " + v1);
				System.out.println("v2: " + v2);
				System.out.println("v3: " + v3);
			}
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			System.out.println("v3: " + v3);
		}
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
	}
	}
