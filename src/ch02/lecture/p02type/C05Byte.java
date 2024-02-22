package ch02.lecture.p02type;

public class C05Byte {
	public static void main(String[] args) {
		byte a = 127;
		byte b = -128;
		byte myByte = (byte) 0b10000000; // 2진수 리터럴로 표현한 후 byte 타입으로 명시적 형변환

		System.out.println(a);
		System.out.println(b);
		System.out.println(myByte);
	}

	}
