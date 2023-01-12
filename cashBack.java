package Zerobase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner; // Scanner 클래스 임포트 !



public class cashBack {




    public static void main(String[] args) {
        // 1. Scanner 객체 생성, System.in : 입력 받기 위한 스트림
        Scanner input = new Scanner(System.in);


        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요. (금액) : ");
        int inputCash = input.nextInt();
        int back = (int)inputCash/10; // 정수형으로! round 같은 것

       if (back>300){
           System.out.println("한 건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다");
           // 만약 넘는다면, 300원으로 준다.
           back = 300;
       }
       // 백원 단위로 캐시백을 준다고 했으니, 먼저 back 변수를 소수점 첫째 자리에서 버림한다.
        double backInt = Math.floor(back/100);
       // 버림한 것에 100을 곱하여 백의 자리만 취한다.
        System.out.println("결제 금액은 "+inputCash+"원이고, 캐시백은 "+100*(int)backInt+"원 입니다.");


    }
}
