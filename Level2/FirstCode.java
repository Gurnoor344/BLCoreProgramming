import java.util.Scanner;

public class FirstCode {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        // Input Section
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Input salary with validation
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--;
                continue;
            }

            // Input years of service with validation
            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--;
                continue;
            }
        }

        // Bonus Calculation
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Bonus and Salary Report ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = ₹%.2f, Bonus = ₹%.2f, New Salary = ₹%.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Bonus Paid: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f\n", totalNewSalary);
    }
}
