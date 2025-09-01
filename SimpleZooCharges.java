import java.util.Scanner;

public class SimpleZooCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Enter a group? (1 for Yes, 0 for No): ");
            int again = scanner.nextInt();
            if (again == 0) break;

            System.out.print("Number of children (6-15): ");
            int children = scanner.nextInt();

            System.out.print("Number of adults (16-59): ");
            int adults = scanner.nextInt();

            System.out.print("Number of seniors (60+): ");
            int seniors = scanner.nextInt();

            int maxAdultsSeniors = adults + seniors;
            int accompaniedChildren = Math.min(children, maxAdultsSeniors);
            int unaccompaniedChildren = children - accompaniedChildren;

            int charge = 0;
            charge += accompaniedChildren * 2;
            charge += unaccompaniedChildren * 5;
            charge += adults * 10;
            charge += seniors * 8;

            System.out.println("Total charge: $" + charge);
            total += charge;
        }

        System.out.println("Total takings: $" + total);
        scanner.close();
    }
}