package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("·method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("·method1 end");
    }

    static void method2(Data data2) {
        System.out.println("··method2 start");
        System.out.println("··data: " + data2.getValue());
        System.out.println("··method2 end");
    }
}

// 지역 변수는 스택 영역에, 객체(인스턴스)는 힙 영역에 관리된다.
