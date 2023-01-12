package Zerobase;
//  Practice
//  다음 클래스 직접 만든 후 객체 생성
//  클래스명: Animal
//  특성: 이름, 무게, 분류
//  기능: 먹기, 잠자기, 걷기, 뛰기

class Animal{
    String name ;
    Double weights;
    String classification;

    Animal(String name, Double weights, String classification){
        this.name = name;
        this.weights = weights;
        this.classification = classification;

    }
    public void printInfo(){
        System.out.println("== Animal Info ==");
        System.out.println("이름 = " + name);
        System.out.println("무게 = " + weights);
        System.out.println("분류 = " + classification);
    }
    public void eat(){
        System.out.println("쿰척쿰척");
    }
    public void sleep(){
        System.out.println("Zzzz....");
    }
    public void walk(){
        System.out.println("걷기");
    }
    public void run(){
        System.out.println("뛰기");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }
}
