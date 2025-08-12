package ref;

/* 기본형과 메서드 호출 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a); // a = 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a); // a = 10

        // 1. 메서드를 호출할 때 매개변수 x에 변수 a의 값을 복사해서 전달한다 (int x = a)
        // 2. 메서드 안에서 값을 변경 : x만 20으로 변경되고 a는 10 그대로 유지된다
        // 3. 메서드가 종료되면 x는 제거되고 `a = 10`이 출력된다
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
