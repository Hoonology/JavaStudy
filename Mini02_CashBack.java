package Zerobase;

import java.util.Scanner; // Scanner 클래스 임포트 !



public class Mini02_CashBack {




    public static void main(String[] args) {
        // 1. Scanner 객체 생성, System.in : 입력 받기 위한 스트림
        Scanner input = new Scanner(System.in);


        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요. (금액) : ");
        // 정수형을 받는 인풋값 생성
        int inputCash = input.nextInt();

        int back = (int)inputCash/10; // 정수형으로! round 같은 것

       if (back>300){
           System.out.println("한 건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다");
           // 만약 넘는다면, 300원으로 준다.
           back = 300;
       }
       // 백원 단위로 캐시백을 준다고 했으니, 먼저 back 변수를 소수점 첫째 자리에서 버림한다.
//        double backInt = Math.floor(back/100);

       // 버림한 것에 100을 곱하여 백의 자리만 취한다.
//        System.out.println("결제 금액은 "+inputCash+"원이고, 캐시백은 "+100*(int)backInt+"원 입니다.");

        // 위 과정들 필요 없이 캐시백을 그냥 이렇게 두면 알아서 버림 되고, format도 할 필요 없다. printf로 맞춤 된다.
        back = back - back % 100;
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다. ", inputCash,back);


    }
}
