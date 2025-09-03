public class Concatenation {
    public static void main(String[] args) {

        String s1 = new String("Welcome");
        String s2 = "welcome";

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 is greater than s2");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("s1 is less than s2");
        }

        String s3 = s1.concat(s2);
        String s4 = s1 + s2;
        String s5 = "!!!";

        System.out.println("Using concat(): " + s3);
        System.out.println("Using + operator: " + s4);

        String combined1 = s1 + s2 + s3 + s4 + s5;
        String combined2 = (((s1.concat(s2)).concat(s3)).concat(s4)).concat(s5);

        System.out.println("Using + : " + combined1);
        System.out.println("Using concat(): " + combined2);
    }
}
