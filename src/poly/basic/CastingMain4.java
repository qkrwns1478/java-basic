package poly.basic;

// instanceof
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1); // ❌

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2); // ⭕
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("⭕ Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("❌ Child 인스턴스 아님");
        }
    }
}

/* 오른쪽 타입에 왼쪽 타입이 들어갈 수 있는가?
new Parent() instanceof Parent
Parent p = new Parent() // 같은 타입 true

new Child() instanceof Parent
Parent p = new Child() // 부모는 자식을 담을 수 있다. true

new Parent() instanceof Child
Child c = new Parent() // 자식은 부모를 담을 수 없다. false

new Child() instanceof Child
Child c = new Child // 같은 타입 true
 */