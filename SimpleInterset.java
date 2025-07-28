import java.util.*;

class SimpleInterset{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int Principal = sc.nextInt();
		float Rate= sc.nextInt();
		float Time = sc.nextInt();
		float SI = (Principal * Rate * Time) / 100;
		System.out.println(SI);
	}
}