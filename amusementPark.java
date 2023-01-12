package Zerobase;

import java.util.Scanner;


public class amusementPark {

    // 메인
    public static void main(String[] args) {

        // 입력 함수 Scanner
        Scanner input = new Scanner(System.in);


        // 디스플레이 구성
        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요. (숫자): ");
        int ageInput = input.nextInt();

        System.out.print("입장시간을 입력해 주세요. (숫자입력): ");
        int timeInput = input.nextInt();

        System.out.print("국가유공자 여부를 입력해주세요. (y/n): ");
        char nationalMerit = input.next().trim().charAt(0);

        System.out.print("복지카드 여부를 입력해 주세요. (y/n): ");
        // trim 함수로 공백 제거, charAt() 함수 : String 타입 -> Char 타입
        // char 타입 변환으로 if 문에서 String 오류 난 것 해결
        char socialWelfare = input.next().trim().charAt(0);

        // 가격
        int entFee;

        if (ageInput <=3){
            entFee = 0;
        }else if ( ageInput <13 || timeInput >=17) {
            entFee = 4000;

        } else if( nationalMerit == 'y' || socialWelfare == 'y' ) {
            entFee = 8000;
        }
        else {
            entFee = 10000;
        }
        // Scanner 종료
        input.close();

        switch (entFee){
            case 0 :
                System.out.println("입장료 : " + entFee);
                System.out.println("3세 미만의 어린이는 무료입장입니다.");
                break;

            case 4000 :
                System.out.println("입장료 : " + entFee);
                System.out.println("특별할인 대상입니다.");
                break;

            case 8000 :
                System.out.println("입장료 : " + entFee);
                System.out.println("일반할인 대상입니다.");
                break;
            }


    }
}