package Zerobase;

// 김성훈
public class gugu {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

    for (int i = 1; i < 10; i ++){
        for (int j = 1; j < 10; j ++){
            // 01 X 01 = 01 형식으로 하기 위해 String.format() 이용
            System.out.print(String.format("%02d",j) + " X " +
                    String.format("%02d",i) + " = " + String.format("%02d",(j * i))+ "   "); // n단과 n단 사이의 공백

        }
        System.out.println("      ");
    }



    }
}
