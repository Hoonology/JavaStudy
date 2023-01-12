package Zerobase.Main12_Inheritance.src;// Java 프로그래밍 - 상속

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person {
    Student(){
        a1 = 1;
        // a2 = 1; // 접근 제어자가 private라 안 된다.
    }

}

// Student2 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person{
    String name; // 부모에도 있지만, 자식에서도 한번 더 만들어보기 시도
    int stdId;

    Student2(String name, int age, int stdId){
        this.name = name;
        super.name = name; // 부모의 것
//        super(name,age);
        this.age = age; // 상속 받은 age
        this.stdId = stdId; // 부모에는 없고, 자기 자신의 것

    }
    public void printInfo(){
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("studId: " + stdId);
    }
}

public class Main {

    public static void main(String[] args) {

//      Test code
//      1. 상속
        // Student 안에는 사실 아무 것도 없지만, Person 을 상속 받아서 값이 출력된다.
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

    }
}
