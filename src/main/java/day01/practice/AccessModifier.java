package day01.practice;


public class AccessModifier {
    private static String a = "a";
    private static String b = "b";
    private static String c = "c";
    private static String d = "d";

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier(); // Create an instance

        System.out.println(accessModifier.a);
        System.out.println(accessModifier.b);
        System.out.println(accessModifier.c);
        System.out.println(d);
    }
}
