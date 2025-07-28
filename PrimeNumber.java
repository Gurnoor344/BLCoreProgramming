import java.util.*;

class PrimeNumber{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		if(number%1==0 && number%2!=0){
			System.out.println("Num is prime");
		}
		else {
			System.out.println("Num is not prime");
		}
	}
}