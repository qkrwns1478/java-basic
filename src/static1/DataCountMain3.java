package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // 1

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); // 2

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count); // 3

        // (추가) 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count); // 4
    }
}

/* 멤버 변수의 종류
 * 인스턴스 변수: static이 붙지 않은 멤버 변수 → 인스턴스를 만들 때마다 새로 만들어진다
 * 클래스 변수: static이 붙은 멤버 변수 (= 정적 변수) → 자바 프로그램을 시작할 때 딱 1개 만들어진다
 */

/* 변수와 생명 주기 
 * 지역 변수: 스택 프레임 → 메서드가 종료되면 스택 프레임이 제거되면서 지역 변수도 함께 제거된다
 * 인스턴스 변수: 힙 프레임 → GC가 발생하기 전까지는 생존하기 때문에 지역 변수보다 생존 주기가 길다
 * 클래스 변수: 메서드 영역의 static 영역 → JVM이 로딩되는 순간 생성되고 JVM이 종료될 때까지 유지된다
 */