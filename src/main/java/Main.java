import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double exit = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(exit!=0) {

            System.out.println("Enter next number:");
            System.out.println("or enter 0 to exit");
            double a = scanner.nextDouble();
            sum +=a;
            exit = a;
            System.out.println("Sum: " + sum);


        }

    }
}
