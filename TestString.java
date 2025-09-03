public class TestString {
    public static void main(String[] args) {
        String s1 = new String("Welcome");
        String s2 = "welcome";

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 is greater than s2");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("s1 is less than s2");     }
    }
}
