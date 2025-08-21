package extend1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // new ElectricCar()를 호출하면 ELectricCar 뿐만 아니라 상속 관계에 있는 Car까지 함께 포함해서 인스턴스(x001)를 생성한다.
        // 상속이라고 해서 단순히 부모의 필드와 메서드만 물려 받는 것이 아니라, 부모 클래스도 함께 포함해서 생성된다.
        electricCar.move();
        // x001.move()를 호출한다. 본인 타입에 move()가 없으므로, 부모 타입에서 move()를 찾아 호출한다.
        electricCar.charge();
        // x001.charge()를 호출한다. 본인 타입에 charge()가 있으므로, 본인 타입에서 charge()를 찾아 호출한다.

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

/* 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
 * 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이 때 호출자의 타입을 통해 대상 타입을 찾는다.
 * 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.
 */