import java.util.Scanner;

public class FactorialNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = 1;
            int i = 1;
            while (i <= num) {
                result *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
