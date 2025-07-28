import java.util.*;
class CelToFah{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int celcius = sc.nextInt();
		float Fahrenheit = (celcius * 9/5) + 32;
		System.out.println(Fahrenheit);
	}
}