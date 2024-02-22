package ch03;

public class C03Overflow {
	public static void main(String[] args) {
		//byte (1), short (2), int (4), long (8)
		// float (4), double (8)

		// overflow: 산술 연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 출력
		// overflow를 방지하려면 적절한 data type을 선택해야 함
		int a = 2_147_483_647;
		int b = 1;
		long c = (long)a+b;
		System.out.println(c);
	}
}
