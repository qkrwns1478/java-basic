package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // 1. data = null
        data = new Data();
        System.out.println("2. data = " + data); // 2. data = ref.Data@23fc625e
        data = null;
        System.out.println("3. data = " + data); // 3. data = null
        // data에 null을 할당하면 x001 Data 인스턴스를 아무도 참조하지 않는다.
        // 아무도 참조하지 않는 인스턴스는 JVM의 GC가 더 이상 사용하지 않는다고 판단해 자동으로 메모리에서 제거한다.
    }
}
