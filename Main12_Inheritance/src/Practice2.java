package Zerobase.Main12_Inheritance.src;// Practice2
// 아래 클래스와 상속 관계에서
// Test code를 수정하지 않고, 아래와 같이 출력될 수 있도록 오버라이딩 해보세요.
// 빵빵!
// 위이잉!
// 빵빵!
// 삐뽀삐보!

class Car {
    Car(){

    }
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {

    public void horn() {
        super.horn(); // 빵빵
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        super.horn();
        System.out.println("삐뽀삐뽀!");

    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        FireTruck truck = new FireTruck();
        truck.horn();

        Ambulance amb = new Ambulance();
        amb.horn();
    }
}
