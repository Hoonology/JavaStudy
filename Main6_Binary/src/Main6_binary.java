package Zerobase.Main6_Binary.src;// Java 프로그래밍 - 여러가지 연산자_2

public class Main6_binary {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result =" + result); // result =1
        // println 은 기본 출력에 라인 넘김으로, 엔터키를 추가하는 것
        System.out.println(Integer.toBinaryString(num1));// 101
        // printf 는 포맷을 만들어서 포맷에 맞게 데이터 값을 넣을 수 있게 하는 것
        // %04의 의미는, 4개 자리수로 출력을 하는데, 그 자리수가 부족하면(못미치면) 맨 앞에 0을 채우란 뜻
        // d 는 정수형 문자를 넣는다는 의미
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0001
//      1-2. OR 연산자 (|)
        result = num1 | num2;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 0111


//      1-3. XOR 연산자 (^)
        System.out.println("== XOR 연산자(^) ==");
        result = num1^num2;
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 0110



//      1-4. 반전 연산자 (~)
        System.out.println("== 반전 연산자(~) ");
        num1 = 5;

        result = ~num1;
        System.out.println("result = " + result); // result = -6
        System.out.printf("%s\n", Integer.toBinaryString(result));
        // 11111111111111111111111111111010
        // 0101이 반전이 돼서 끝에 4자리가 1010, 앞에 부호가 모두 1로 바뀜



//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int numA = 3;
        result = numA <<1;

        System.out.println("result = " + result); // result = 6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));// 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 0110




//      2-2. >> 연산자
        result = numA >>1;

        System.out.println("result = " + result); // result = 1
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));// 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));// 0001


//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA)); // 11111111111111111111111111111011
        System.out.printf("%s\n", Integer.toBinaryString(result));// 11111111111111111111111111111101

        result = numA>>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA)); // 11111111111111111111111111111011
        System.out.printf("%s\n", Integer.toBinaryString(result));// 1111111111111111111111111111101

    }

}
