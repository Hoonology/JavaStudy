package Zerobase.Main13_Polymorphism.src;// Practice
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car {
    Car(){}
    public void horn() {

        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
//        Car c1 = new Car();
//        FireTruck ft = new FireTruck();
//        Ambulance ab = new Ambulance();
//
//        c1.horn();
//        ft.horn();
//        ab.horn();

        // 위 코드는 자식 객체를 사용하지 않음
        Car car = new Car();
        car.horn();
        car = new FireTruck();
        car.horn();
        car = new Ambulance();
        car.horn();

        Car car2[] = {new Car(), new FireTruck(), new Ambulance()};

        for (Car item : car2){
            item.horn();
        }

    }
}
