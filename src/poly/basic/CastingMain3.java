package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 (ClassCastException) 발생
        child2.childMethod(); // 실행 불가
        // 메모리 상에서 Child가 존재하지 않으므로 Child 자체를 사용할 수 없음
    }
}

/* 업캐스팅이 안전하고 다운캐스팅이 위험한 이유
 * 업캐스팅의 경우: 객체를 생성하면 해당 타입의 상위 부모 타입이 함께 생성되므로, 위로만 타입을 변경하는 업캐스팅은 메모리 상에서 인스턴스가 모두 존재하기 때문에 항상 안전하다 -> 캐스팅 생략 가능
 * 다운캐스팅의 경우: 객체를 생성하면 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않으므로, 인스턴스에 존재하지 않는 하위 타입으로 캐스팅되는 문제가 발생할 수 있다 -> 캐스팅 생략 불가
 */