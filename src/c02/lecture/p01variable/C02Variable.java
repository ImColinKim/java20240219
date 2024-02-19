package c02.lecture.p01variable;

public class C02Variable {
    public static void main(String[] args) {
        // 변수에 값이 할당되지 않았을 때 사용할 수 없음
        int a;
        a = 10;
        System.out.println(a);

        int c = 10;
        System.out.println(c*10);

        // 변수 여러개를 한 명령문에서 선언 가능

        int d, e, f;
        d = 1;
        e = 2;
        f = 3;

        // 여러 변수 선언, 값 할당을 한 명령문에 작성 가능
        int g = 11, h = 12, i = 13;
        System.out.println(g + h + i);

        // 다른 변수의 값을 대입하는 것 가능
        int j = 14;
        int k = j;
    }


}
