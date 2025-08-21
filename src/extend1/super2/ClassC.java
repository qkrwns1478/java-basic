package extend1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // ClassB에는 기본 생성자가 없어 기본 생성자를 호출하는 super()를 사용하거나 생략할 수 없음
        System.out.println("ClassC 생성자");
        // ClassA → ClassB → ClassC 순으로 실행됨
        // 생성자의 실행 순서가 결과적으로 최상위 부모부터 실행되어서 하나씩 아래로 내려옴
        // 자식 생성자의 첫 줄에서 부모의 생성자를 호출해야 하기 때문에 초기화는 최상위 부모부터 이루어짐
    }
}

// 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터를 초기화한다.
// 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 `super(...)`를 호출해야 한다. 단 기본 생성자(`super()`)인 경우 생략할 수 있다.