// Java 프로그래밍 - 반복문

public class Main8_For_While {
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");
//      1-1. 기본 사용 방법

//     바깥쪽 i = 0 일 때, 안에서 1까지 ... i = 1일 때 2 까지 ...
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

      // continue 는 i == 2 일 때 아래 코드를 실행하지 않는다.
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       // break 는 i == 2 일 때 종료한다.
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      1-2. for each
        System.out.println("== for each ==");
        int[] nums = {1,2,3,4,5};
        for (int i = 0; i<5; i++){
            System.out.println(nums[i]);
        }

        for (int num : nums){
            System.out.println(num);
        }


//      2. 반복문 - while
        System.out.println("== while ==");

//      2-1. while
        int i = 0;
        while (i<5){
            System.out.println(i++);
        }
        System.out.println();
        i = 0 ;
        while (i<5){
            if(i==2){
                i++;
                continue;
            }
            System.out.println(i++);
        }
        System.out.println();
        i = 0 ;
        while (i<5){
            if(i==2){
                i++;
                break;
            }
            System.out.println(i++);
        }


//      2-2. do-while
        System.out.println("== do while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);


        System.out.println("==========");
//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//      *
//      ***
//      *****
//      *******

        for (int a = 0; a < 7; a++){
              if (a % 2 != 0){
                  continue;
              }
            for (int b = 0; b < a + 1; b++){
                System.out.print("*");
            }
            System.out.println();
        }




//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;
        while (waterTemperature < 100){
            waterTemperature++;

            if(waterTemperature % 10 == 0){
                System.out.println(waterTemperature + "도 입니다. ");
            }
        }

    }
}
