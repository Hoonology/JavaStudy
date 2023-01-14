package Zerobase;

import java.time.LocalDate;
import java.util.Scanner;

public class Mini05_Calendar {
    public static void main(String[] args) {

        // 1. 연도와 달의 변수 초기화
        int year = 2022;
        int month = 3;
        StringBuilder sb = new StringBuilder();

        // 2. 입력값
        Scanner scanner = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        year = scanner.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        month = scanner.nextInt();


//      LocalDate localDate = new LocalDate() // 이 생성자가 안 된다.
        LocalDate localDate = LocalDate.of(year, month, 1);

        // 요일 출력하는 함수
//        System.out.println(localDate.getDayOfWeek().getValue()); // 2

        int prefixCount = localDate.getDayOfWeek().getValue();

        // 3 월의 맨 마지막 날짜 ? 4월 1일에서 하루를 뺀 값
        int lastDay = localDate.plusMonths(1).minusDays(1).getDayOfMonth();


        System.out.println(localDate); // 2022-03-01
        System.out.println(lastDay); // 31

        String[] title = {"일", "월", "화", "수", "목", "금", "토"};

        int totalCount = 0;
        for (int i = 0; i < title.length; i++) {
//            System.out.print(title[i]+"\t");
            sb.append(title[i] + "\t");
        }
//        System.out.println(" "+"\n");
        sb.append("\n");

        for (int i = 0; i < prefixCount; i++) {
//            System.out.print(" " + "\t");
            sb.append(" " + "\t");
            totalCount++;
        }

        for (int i = 1; i <= lastDay; i++) {
//            System.out.print(i + "\t");
            sb.append(i + "\t");
            totalCount++;
            if (totalCount % 7 == 0) {
//                System.out.print("\n");
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

    }


}
