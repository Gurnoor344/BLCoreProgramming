import java.util.*;

class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print its multiplication table: ");
		int num = sc.nextInt();
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = num *(i+1);
			System.out.println(num + "x" + (i+1) + "=" + arr[i]);
		}
	}
}