import java.util.*;

class MTD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
    }
}
