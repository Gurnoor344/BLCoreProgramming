import java.util.Scanner;

public class JavaHandling {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;

        // Convert input to lowercase for easy comparison
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display the result
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels and consonants
        countVowelsAndConsonants(input);
    }
}
