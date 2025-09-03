import java.util.Scanner;
public class ScannerRadius {

            public static void main(String[] args){
            Scanner input = new Scanner (System.in);
            //Prompt the user for input
            System.out.println("Enter a radius: ");
            int radius= input.nextInt();
            if (radius >=0){
                int area= (int) (radius * radius * 3.14159);

                System.out.println("The area for the "+" circle of radius "+ radius+ " is "+ area);
        }
            else {
                System.out.println("Negative input");
            }
    }
}
