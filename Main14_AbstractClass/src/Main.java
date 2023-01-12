package Zerobase.Main14_AbstractClass.src;//

// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();

}


// 추상 클래스 상속
class Student extends Person{
    public void printInfo(){
        System.out.println("Student.printInfo");
    }

}

public class Main {

    public static void main(String[] args) {
        
//        추상 클래스의 사용
        // Person p1 = new Person(); 불가능
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");

            }
        };
        p2.printInfo();
    }

}
