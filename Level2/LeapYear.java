import java.util.*;

class LeapYear{
	public static boolean isLeapYear(int year){
		if((year%2==0 && year%100!=0) || (year%400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year =sc.nextInt();
		
		if(year<1582){
			System.out.println("invalid input ");
			return ;
		}
		if(isLeapYear(year)){
			System.out.println(year + " is leap year");
		}
		else{
			System.out.println(year + " is not a leap Year");
		}
	}
}