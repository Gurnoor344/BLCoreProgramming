import java.util.*;

class AAA{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        int heightAmar = sc.nextInt();

        
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height : ");
        int heightAkbar = sc.nextInt();

        
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = sc.nextInt();

        
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest friend is Amar.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest friend is Akbar.");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest friend is Anthony.");
        } else {
            System.out.println("Two or more friends have the same youngest age.");
        }

       
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest friend is Amar.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest friend is Akbar.");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest friend is Anthony.");
        } else {
            System.out.println("Two or more friends have the same tallest height.");
        }
    }
}