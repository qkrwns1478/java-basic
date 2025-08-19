package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("Before: " + s);
        System.out.println("After: " + deco);

        String s2 = "Hello World";
        DecoUtil1 utils2 = new DecoUtil1();
        String deco2 = utils2.deco(s2);

        System.out.println("Before: " + s2);
        System.out.println("After: " + deco2);
    }
}
