import java.util.*;

class PrintOE{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 1){
			System.out.println("The number" + num + "is not a natural num");
		}
		else{
			for(int i=0;i<=num;i++){
				if(i%2==0){
					 System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
	}
}