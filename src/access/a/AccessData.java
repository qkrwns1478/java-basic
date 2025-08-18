package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출: " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출: " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출: " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

/* 접근 제어자 종류
 * private: 모든 외부 호출을 막는다.
 * default (package-private): 같은 페이지 안에서의 호출은 허용한다.
 * protected: 같은 패키지 안에서의 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
 * public: 모든 외부 호출을 허용한다.
 */

/* 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
 * private: 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
 * default: 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
 * protected: 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
 * public: 기능을 숨기지 않고 어디서든 호출할 수 있게 한다.
 */