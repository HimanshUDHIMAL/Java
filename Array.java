import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter how many numbers you want: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Error: The size must be greater than 0.");
                return;
            }

            double[] myList = new double[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                myList[i] = scanner.nextDouble();
            }

            // Find maximum
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > max) {
                    max = myList[i];
                }
            }

            System.out.println("The maximum value is: " + max);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numeric values only.");
        } finally {
            scanner.close();
        }
    }
}
