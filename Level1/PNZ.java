import java.util.*;

class PNZ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }


		
		for(int i=0;i<num.length;i++){
			 System.out.println("\nFor number: " + num[i]);
			if(num[i] <0){
				System.out.println("Num is negative");
			}
			else if(num[i] >0){
				System.out.println("Num is postive");
			}
			else{
			System.out.println("Num is zero");
			}
			
			if(num[i] != 0){
				if(num[i]%2==0){
					System.out.println("Num is even");
				}
				else{
					System.out.println("Num is odd");
				}
			}
		
			if(i>0){
				if(num[i]==num[i-1]){
					System.out.println("Numbers are equal");
				}
				else if(num[i]>num[i-1]){
					System.out.println("Num1 is greater");
				}
				else {
					System.out.println("Num1 is less");
				}
			}
		}
	}
}
					