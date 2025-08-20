package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myID", "park");
        member.print(); // myID, park
        member.changeData("myID2", "munsik");
        member.print(); // myID, munsik
    }
}
