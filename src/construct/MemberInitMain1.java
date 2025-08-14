package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.score = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.score = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 점수: " + s.score);
        }
    }
}
