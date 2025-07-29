import java.util.Scanner;

public class YoungestTallest{
    public static void main(String[] args) {
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        Scanner sc = new Scanner(System.in);

      
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age for " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height (in cm) for " + friends[i] + ": ");
            heights[i] = sc.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
            }
        }

    
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
