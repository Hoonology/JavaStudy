package Zerobase.Main20_Lambda;// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);
}



public class Main {

    public static void main(String[] args) {

        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y ;
            }
        };
        System.out.println(cTool1.compute(1,2)); // 3

        // 람다식
        ComputeTool cTool2 = (x, y) -> {return  x + y;};
        System.out.println(cTool2.compute(1,2)); // 3

    }
}
