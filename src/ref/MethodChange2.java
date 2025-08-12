package ref;

/* 참조형과 메서드 호출 */
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // dataA.value = 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); // dataA.value = 20
        
        // 1. 메서드 호출할 때 매개변수 dataX에 변수 dataA의 값을 복사해서 전달한다 (Data dataX = dataA)
        // 2. 메서드 안에서 dataX.value를 20으로 변경한다. 참조값을 통해 x001 인스턴스의 value가 20으로 변경되었다
        // 3. 메서드 종료 후 dataX는 제거되지만, x001.value가 변경되었기 때문에 dataA.value가 20으로 출력된다
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
