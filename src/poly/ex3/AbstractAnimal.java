package poly.ex3;

// 추상 클래스: 직접 인스턴스를 생성하지 못하는 클래스
public abstract class AbstractAnimal {

    // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    // 추상 메서드는 자식에서 반드시 오버라이딩을 해야 한다.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
