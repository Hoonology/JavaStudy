package Zerobase;

import java.util.*;
import java.util.ArrayList;

import static java.lang.String.join;

public class lotto {
    public static void main(String[] args) {

        int lottoEg = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.println(" ");

        // 로또 입력 개수가 0개 이하, 11개 이상인 것을 방지
        while (true) {
            System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) : ");
            lottoEg = input.nextInt();

            if (lottoEg > 10) {
                System.out.println("[ System Error ]");
                System.out.println(" 로또 개수는 10개가 최대입니다.");
                System.out.println(" 입력창으로 다시 돌아갑니다.");
                System.out.println(" ");
                continue;
            } else if (lottoEg <= 0) {
                System.out.println("[ System Error ]");
                System.out.println(" 로또 개수를 1개 이상 입력해주세요.");
                System.out.println(" 입력창으로 다시 돌아갑니다.");
                System.out.println(" ");
                continue;
            }
            break;
        }

        Random rnd = new Random();

        // 6 개의 번호를 담을 리스트 생성
        int[] lottoList = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList.length; i++) {
            lottoList[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList[i] == lottoList[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList2 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList2.length; i++) {
            lottoList2[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList2[i] == lottoList2[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList3 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList3.length; i++) {
            lottoList3[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList3[i] == lottoList3[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList4 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList4.length; i++) {
            lottoList4[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList4[i] == lottoList4[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList5 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList5.length; i++) {
            lottoList5[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList5[i] == lottoList5[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList6 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList6.length; i++) {
            lottoList6[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList6[i] == lottoList6[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList7 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList7.length; i++) {
            lottoList7[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList7[i] == lottoList7[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList8 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList8.length; i++) {
            lottoList8[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList8[i] == lottoList8[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList9 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList9.length; i++) {
            lottoList9[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList9[i] == lottoList9[j]) {
                    i--;
                    break;
                }
            }
        }

        int[] lottoList10 = new int[6]; // 1 2 3 4 5 6
        // 중복 제거
        for (int i = 0; i < lottoList10.length; i++) {
            lottoList10[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoList10[i] == lottoList10[j]) {
                    i--;
                    break;
                }
            }
        }


        switch (lottoEg) {
            case 1:
                System.out.println("A   " + Arrays.toString(lottoList));
                break;

            case 2:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                break;

            case 3:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                break;

            case 4:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                break;

            case 5:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                break;

            case 6:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                break;

            case 7:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                break;

            case 8:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                break;

            case 9:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                System.out.println("I   " + Arrays.toString(lottoList9));
                break;

            case 10:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                System.out.println("I   " + Arrays.toString(lottoList9));
                System.out.println("J   " + Arrays.toString(lottoList10));
                break;

        }


        // 리스트 섞기
//        Collections.shuffle(lottoList4);

        // 리스트에서 6개의 숫자가 담긴 그릇을 가져오기
//        for(int i = 0; i < 6; i ++){
//
//            System.out.print(lottoList4.get(i)+" ");
//
//        }


        int[] lottoWin = new int[6];
        // 중복 제거
        for (int i = 0; i < lottoList3.length; i++) {
            lottoWin[i] = rnd.nextInt(46); // 바운더리 46
            for (int j = 0; j < i; j++) {
                if (lottoWin[i] == lottoWin[j]) {
                    i--;
                    break;
                }
            }
        }


        System.out.println(" ");
        System.out.println("[로또 발표]");
        String win = Arrays.toString(lottoWin);

        System.out.println(win);

        System.out.println(" ");
        System.out.println("[내 로또 결과]");


        switch (lottoEg) {
            case 1:
                System.out.println("A   " + Arrays.toString(lottoList) + "=>" + "개 일치");
                break;

            case 2:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                break;

            case 3:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                break;

            case 4:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                break;

            case 5:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                break;

            case 6:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                break;

            case 7:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                break;

            case 8:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                break;

            case 9:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                System.out.println("I   " + Arrays.toString(lottoList9));
                break;

            case 10:
                System.out.println("A   " + Arrays.toString(lottoList));
                System.out.println("B   " + Arrays.toString(lottoList2));
                System.out.println("C   " + Arrays.toString(lottoList3));
                System.out.println("D   " + Arrays.toString(lottoList4));
                System.out.println("E   " + Arrays.toString(lottoList5));
                System.out.println("F   " + Arrays.toString(lottoList6));
                System.out.println("G   " + Arrays.toString(lottoList7));
                System.out.println("H   " + Arrays.toString(lottoList8));
                System.out.println("I   " + Arrays.toString(lottoList9));
                System.out.println("J   " + Arrays.toString(lottoList10));
                break;

        }


    }
}
