package access;

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

public class Speaker {
    private int volume; // private 사용

    public Speaker(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    public void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 감소할 수 없습니다. 최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    public void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
