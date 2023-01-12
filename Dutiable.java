package Zerobase;

import java.util.Scanner;

public class Dutiable {
    public static void main(String[] args) {
        int userMoney;
        int tax = 0;


        System.out.println("[과세금액 계산 프로그램]");
        Scanner input = new Scanner(System.in);


        System.out.print("연소득을 입력해 주세요. :");
        int inputMoney = input.nextInt();


        if (inputMoney <= 12000000) {
            tax = (int) (inputMoney * 0.06);

        } else if ( 1200000 < inputMoney && inputMoney<=46000000) {
            tax = (int) (inputMoney * 0.15);

        } else if ( 46000000 < inputMoney && inputMoney <= 88000000 ) {
            tax = (int) (inputMoney * 0.24);

        } else if ( 88000000 < inputMoney && inputMoney <= 150000000 ) {
            tax = (int) (inputMoney * 0.35);

        } else if ( 150000000 < inputMoney && inputMoney <= 300000000 ) {
            tax = (int) (inputMoney * 0.38);

        } else if ( 300000000 < inputMoney && inputMoney <= 500000000 ) {
            tax = (int) (inputMoney * 0.40);

        } else if ( 500000000 < inputMoney && inputMoney <= 1000000000 ) {
            tax = (int) (inputMoney * 0.42);

        } else if ( 1000000000 < inputMoney ) {
            tax = (int) (inputMoney * 0.45);
        }



        System.out.println();
        System.out.println("[세율에 의한 세금]: ");
        System.out.println(tax);


        System.out.print("[누진공제 계산에 의한 세금]: ");


    }
}
