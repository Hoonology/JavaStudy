package Zerobase.Main3.src;
// Java 프로그래밍 - 변수와 자료형_3

import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);
        

//      1-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5));
        System.out.println(s3 == s5);

//      1-2. indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); // 5 
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));

//      1-3. replace
        String s7 = s6.replace("Hello","Bye");
        System.out.println("s7 = " + s7);

//      1-4. substring
        System.out.println(s7.substring(0,3));
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);      
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);
        
        String a = "01234";
        String b = "56789";
        
        a += b;
        System.out.println(a);


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");


    }
}
