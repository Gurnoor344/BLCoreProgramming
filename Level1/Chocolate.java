import java.util.Scanner;

public class Chocolate {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates / numberOfChildren; // Quotient
        result[1] = numberOfChocolates % numberOfChildren; // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

     
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
