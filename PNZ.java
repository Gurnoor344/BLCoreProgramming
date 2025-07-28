import java.util.*;

class PNZ{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0){
			System.out.println("number is negative "+ num);
		}
		else if(num ==0){
			System.out.println("number is zero "+ num);
		}
		else if(num > 0 ){
			System.out.println("number is positive "+ num);
		}
	}
}