import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // convert cm to meter
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // store BMI in third column
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3]; // [weight, height, BMI]

      
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

       
        calculateBMI(personData);

        
        String[] bmiStatus = getBMIStatus(personData);

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
    }
}
