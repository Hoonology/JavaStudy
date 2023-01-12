package Zerobase;

import java.util.Random;
import java.util.Scanner;



public class juminNum {

    public static void main(String[] args) {
        // 입력 변수 input 생성
        Scanner input = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy) : ");
        int yearInput = input.nextInt();

        
        System.out.print("출생월을 입력해 주세요.(mm) : ");
        int monthInput = input.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd) : ");
        int dayInput = input.nextInt();

        System.out.print("성별을 입력해 주세요. (m/f) : ");
        char sexInput = input.next().charAt(0);


        //랜덤 객체 생성
        Random ranNum = new Random(); 
        int bound = 1000000; // 6자리 숫자를 만들기 위함
//        System.out.println(ranNum.nextInt(bound));



/*       처음에 위에 sexInput 변수를 정의할 때, String 으로 해서 값이 전달이 안 됐는데,
         char 로 바꾸니 하기와 같이 if 문을 완성시킬 수 있게 됐다.                      */

        // 성별에 따른 값
        // if 문은 m을 제외한 아무 값이나 넣어도 4가 표출된다. switch 문으로 구성해보자
/*        if(sexInput == 'm'){
            sexInput = '3';
        } else {
            sexInput = '4';
        }                                                 */

        switch (sexInput){
            case 'm' :
                sexInput = '3';
                break;
            case 'f' :
                sexInput = '4';
                break;

        }


        System.out.println(
                String.format("%04d",yearInput)
                + String.format("%02d",monthInput)
                + String.format("%02d",dayInput)
                + " - "
                + sexInput + ranNum.nextInt(bound));




        }
}
