import java.util.Scanner;

public class LogicalOperatorsCheck {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            // Using logical AND (&&) and relational operator (==)
            if ((a + b == c) && (c > a) && (c > b)) {
                System.out.println("The third number is the sum of the first two numbers.");
            } else {
                System.out.println("The third number is NOT the sum of the first two numbers.");
            }

            sc.close();
        }
}
