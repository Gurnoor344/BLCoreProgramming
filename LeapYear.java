import java.util.*;

class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = sc.nextInt();
		
		if(year<1582){
			System.out.println("this a before year in the Gregorian calendar");
		}
		else{
			if(year%4!=0){
				System.out.println("not a leap year");
			}
			else if(year%100!=0){
				System.out.println("leap year");
			}
			else if(year%400==0){
				System.out.println("leap year");
			}
			else{
				System.out.println("Not a leap year");
			}
		}
	}
}
			