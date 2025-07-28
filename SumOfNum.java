import java.util.*; 

class SumOfNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		int origNumber = input.nextInt(); 
		int number = origNumber;
		int sum = 0; 
		while (number != 0) { 
		int digit = number % 10; 
		sum += digit; 
		number = number / 10;
		}
		System.out.println(sum);
	}
}
		