package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        pack.b.User user2 = new pack.b.User(); // 같은 이름의 클래스는 하나만 import 가능
    }
}
