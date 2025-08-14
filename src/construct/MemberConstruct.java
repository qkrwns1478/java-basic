package construct;

public class MemberConstruct {
    String name;
    int age;
    int score;

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        // this.name = name;
        // this.age = age;
        // this.score = 50;
    }

    // 생성자의 이름은 클래스명과 같고, 반환 타입이 없어야 한다.
    MemberConstruct(String name, int age, int score) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",score=" + score);
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
