import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("The number " + num + " is not a positive integer.");
        } else {
            System.out.println("Factors of " + num + " are:");
            
            // Loop from 1 to number
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
