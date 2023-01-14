package Zerobase;

import java.util.Scanner;


public class Mini03_AmusementPark {

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
        String nationalMerit = input.next();

        System.out.print("복지카드 여부를 입력해 주세요. (y/n): ");
        // trim 함수로 공백 제거, charAt() 함수 : String 타입 -> Char 타입
        // char 타입 변환으로 if 문에서 String 오류 난 것 해결
        String socialWelfare = input.next();

        // 가격
        int entFee; // 초기화를 하지 않았다.

        if (ageInput <= 3) {
            entFee = 0;
            // 특별할인 조건
        } else if (ageInput < 13 || timeInput >= 17) {
            entFee = 4000;
            // 일반할인 조건
            // 1. String 주소값을 본다고 한다면 ' == '를 쓰면 안 되고 equal 을 써야한다.
//      } else if (nationalMerit == 'y' || socialWelfare == 'y')
            // 2. 하지만 대문자 Y가 나올 수도 있기 때문에 equalsIgnoreCase 를 쓴다.
            /*
                (  nationalMerit != null
                && nationalMerit.equalsIgnoreCase("y")
                || socialWelfare.equalsIgnoreCase("y") )                     */

            // 3. != null 이라는 조건을 추가적으로 넣어야하기 때문에 문자열을 기준으로 비교를 한다.
        } else if ("y".equalsIgnoreCase(nationalMerit)
                || "y".equalsIgnoreCase(socialWelfare)) {
            entFee = 8000;

        } else {
            entFee = 10000;
        }

        // Scanner 종료
        input.close();

        switch (entFee) {
            case 0:
                System.out.println("입장료 : " + entFee);
                System.out.println("3세 미만의 어린이는 무료입장입니다.");
                break;

            case 4000:
                System.out.println("입장료 : " + entFee);
                System.out.println("특별할인 대상입니다.");
                break;

            case 8000:
                System.out.println("입장료 : " + entFee);
                System.out.println("일반할인 대상입니다.");
                break;
        }
        switch (nationalMerit){
            case "y" :
                System.out.println("나라를 위해 헌신해주셔서 감사합니다.");

        }

        }

    }
