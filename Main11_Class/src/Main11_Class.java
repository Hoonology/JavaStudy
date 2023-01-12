// Java 프로그래밍 - 클래스와 객체_2
package Zerobase.Main11_Class.src;

import Zerobase.car.Car22;

class Car {
    String name;
    String type;

    Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현
    public void printCarInfo(String date){
        this.printCarInfo();
        System.out.println("date : " + date);

    }
    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println("number : " + number);
    }
    public void printCarInfo(String date, int number){
        this.printCarInfo();
        System.out.println("date : " + date);
        System.out.println("number : " + number);
    }
}


class Car3 {
    // 스태틱 변수
    static String name = "None"; // 객체가 만들어지기 전 부터 name 변수 만든 것
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName(){
        System.out.println("Car name : " + name);
    }
}


public class Main11_Class {

    public static <Car2> void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022", 1234);


//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car22 myCar2 = new Car22("a","b","c","d");
        System.out.println(myCar2.name1);
        System.out.println(myCar2.name2);
        System.out.println(myCar2.name3);
        System.out.println(myCar2.name4);


//      3. Static
        System.out.println("=== Static ===");
        Car3.getName();
        Car3 myCar3_1 = new Car3("a","sedan");
        Car3 myCar3_2 = new Car3("b","suv");
        Car3 myCar3_3 = new Car3("c","rv");
        myCar3_1.printCarInfo(); // c
        myCar3_2.printCarInfo(); // c
        myCar3_3.printCarInfo(); // c
        // 변수가 static 으로 잡혀있으면 마지막 값으로 공유가 된다.
    }

}