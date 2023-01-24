// 기초 수학 - 조합

public class Main {

    static int getCombination(int n, int r) {
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return pResult / rResult;
    }


    public static void main(String[] args) {
//      1. 조합
        System.out.println("== 조합 ==");

        int n = 4;
        int r = 2;

        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }

        System.out.println(pResult / rResult); // 6


//      2. 중복 조합
        System.out.println("== 중복 조합 ==");
        n = 2;
        r = 3;


        System.out.println("결과 : " + getCombination(n + r - 1, r)); // 4
    }
}
