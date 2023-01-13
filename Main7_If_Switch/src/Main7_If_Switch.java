package Zerobase.Main7_If_Switch.src;// Java 프로그래밍 - 조건문

public class Main7_If_Switch {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 99;

        if (waterTemperature >=100){
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다.");
        }

        int score =90;
        char grade = 0;
        if (score>= 90){
            grade = 'A';
        } else if (score >=80){
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade );


//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch (fruit){
            case "apple" :
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry" :
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }

        System.out.println("==============");
        System.out.println("Q1.");
        System.out.println("number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.");
        int number = 5;
        if(number % 2 ==0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        System.out.println("==============");
        System.out.println("Q2.");
        System.out.println("아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다."+"\n"+ "이를 switch 조건문 기반으로 바꿔보세요.");


//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
//
        int myGcore = 100; // 9
        char myGrade = 0;
        switch (score/10){
            case 10 :
            case 9 :
                myGrade = 'A';
                System.out.println("grade 는" + myGrade + "입니다.");
                break;
            case 8 :
                myGrade = 'B';
                System.out.println("grade 는" + myGrade + "입니다.");
                break;
            case 7 :
                myGrade = 'C';
                System.out.println("grade 는" + myGrade + "입니다.");
                break;
            default:
                myGrade = 'F';
                System.out.println("grade 는" + myGrade + "입니다.");

        }

    }
}
