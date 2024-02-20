package c02.lecture.p02type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C16Var {
	public static void main(String[] args) {
// var : 변수 타입을 할당되는 값으로 부터 추론
//		지역변수에서만 사용 가능(필드, 파라미터, 리턴타입에서 사용 불가)
		int a = 10;
		var b = "가운데";
		var c = 1;
		var d = 4.23;

		int g;
		g = 10;

		List<Map<String, Integer>> list1 = new ArrayList<>();
		List<Map<String, Integer>> list2 = new ArrayList<>();
		var list3 = new ArrayList<Map<String, Integer>>();

		byte byteValue = 10;
		char charValue = 'A';

		// int intValue = byteValue; // 문제 없음
		int intValue = charValue; // 문제 없음, char에서 int로 자동 변환
		short shortValue = (short) charValue; // char에서 short로 명시적 변환
		double doubleValue = byteValue; // byte에서 double로 자동 변환

	}

	}


