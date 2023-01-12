package Zerobase;

import java.util.Scanner;

public class Work1 {

    public static void displayMenu() {
        System.out.println("<<<<[메뉴선택]>>>>");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");


    }

    // 매개변수로 inputMenu 지정
    public static void selcetMenu(int inputMenu) {
        switch (inputMenu) {
            case 1:
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;
            case 2:
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;
            case 3:
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;
            case 4:
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;
            case 5:
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("입력 값이 정확하지 않습니다.");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exitYn = false;


        // 무한 반복을 위해 while문 작성
        while (exitYn == false) {
            displayMenu();

            // 숫자만 입력하기 위하여 !
            int inputMenu = scanner.nextInt();
            selcetMenu(inputMenu);

            // 종료를 해야하니깐
            if (inputMenu == 5) {
                exitYn = true;

            }
        }

    }
}
