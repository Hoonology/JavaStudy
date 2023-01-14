package Zerobase;

// 김성훈
public class Mini01_gugu {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        // 2. for문 추가 작성
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                // 01 X 01 = 01 형식으로 하기 위해 String.format() 이용
//            System.out.print(String.format("%02d",j) + " X " +
//                    String.format("%02d",i) + " = " + String.format("%02d",(j * i))+ "   "); // n단과 n단 사이의 공백
                // 1. String.format 을 더 이쁘게 써보자
                String msg = String.format("%02d * %02d = %02d\t", i, j, i * j); // 1단
                System.out.print(msg);

            }
            System.out.println("      ");
        }


    }
}

