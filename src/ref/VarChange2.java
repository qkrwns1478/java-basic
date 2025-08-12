package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10; // 참조값 x001이 들어있다.
        Data dataB = dataA; // dataA에 들어있는 참조값(x001)을 복사해서 dataB에 대입한다. (dataA가 가리키는 인스턴스를 복사하는 것이 아니다!)

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        dataA.value = 20; // dataA가 가르키는 x001 인스턴스의 value를 20으로 변경한다.
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        dataB.value = 30; // dataB가 가르키는 x001 인스턴스의 value를 30으로 변경한다.
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
