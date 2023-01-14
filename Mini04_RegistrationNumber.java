package Zerobase;

import java.util.Random;
import java.util.Scanner;


public class Mini04_RegistrationNumber {
    public static String createRegiNo(int year, int month, int day, String gender) {

        // 1.
        // yymmdd-gnnnnnn
        // nnnnnn -> 임의생성 중복 될 경우는 ? 이미 있는 값을 배제하고 만드는 디테일 생성한다!
        // 대문자로 시작하는 것은 jdk 에서 제공되는 클래스니깐 생성해줘야한다.
        Random rnd = new Random();
        int min = 1;
        int max = 999999;
        int seq = rnd.nextInt(max - min + 1) + min;
        // 삼항 연산자
        int genderValue = "m".equalsIgnoreCase(gender) ? 3 : 4;

        String 주민번호 = String.format("%02d%02d%02d-%d%06d"
                , year -2000, month, day, genderValue, seq);
        return 주민번호; // public static "String" createRegiNo -> String 을 리턴한다.
    }

    public static void main(String[] args) {

/*      int year = 2002;
        int month = 4;
        int day = 12;
        String gender = "m";
        // 20020412-3036112
        // 20020412-3628125

        String createRegiNo = createRegiNo(year, month, day, gender);
        System.out.println(createRegiNo);                                  */


        // 입력 변수 input 생성
        Scanner input = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy) : ");
        int inputYear = input.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm) : ");
        int inputMonth = input.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd) : ");
        int inputDay = input.nextInt();

        System.out.print("성별을 입력해 주세요. (m/f) : ");
        String inputSex = input.next();

        String createRegiNo = createRegiNo(inputYear, inputMonth, inputDay, inputSex);
        System.out.println(createRegiNo);



//
//
//        //랜덤 객체 생성
//        Random ranNum = new Random();
//        int bound = 1000000; // 6자리 숫자를 만들기 위함
////        System.out.println(ranNum.nextInt(bound));
//
//
//
///*       처음에 위에 sexInput 변수를 정의할 때, String 으로 해서 값이 전달이 안 됐는데,
//         char 로 바꾸니 하기와 같이 if 문을 완성시킬 수 있게 됐다.                      */
//
//        // 성별에 따른 값
//        // if 문은 m을 제외한 아무 값이나 넣어도 4가 표출된다. switch 문으로 구성해보자
///*        if(sexInput == 'm'){
//            sexInput = '3';
//        } else {
//            sexInput = '4';
//        }                                                 */
//
//        switch (sexInput) {
//            case 'm':
//                sexInput = '3';
//                break;
//            case 'f':
//                sexInput = '4';
//                break;
//
//        }
//
//
//        System.out.println(
//                String.format("%04d", yearInput)
//                        + String.format("%02d", monthInput)
//                        + String.format("%02d", dayInput)
//                        + " - "
//                        + sexInput + ranNum.nextInt(bound));
//
//
//    }
    }
    }
