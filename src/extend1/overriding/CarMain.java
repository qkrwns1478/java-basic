package extend1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // "전기차를 빠르게 이동합니다"
        // electricCar의 타입인 ElectricCar 타입에서 시작한다. ELectricCar 타입에 move() 메서드가 있으므로 부모 타입을 찾지 않는다.

        GasCar gasCar = new GasCar();
        gasCar.move(); // "차를 이동합니다"
    }
}

/* 오버로딩과 오버라이딩
 * 메서드 오버로딩: 메서드 이름이 같고 매개변수(파라미터)가 다른 메서드를 여러 개 정의하는 것
 * 메서드 오버라이딩: 하위 클래스에서 상위 클래스의 메서드를 재정의하는 것. 상속 관계에서 부모의 기능을 자식이 다시 정의하는 것
 */