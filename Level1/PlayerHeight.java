import java.util.*;

class PlayerHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[11];
		double sum=0;
		
		System.out.println("enter heights:");
		
		for(int i=0;i<heights.length;i++){
			System.out.println("Player" + (i+1) + ":");
			heights[i]=sc.nextDouble();
			sum+= heights[i];
		}
		double mean = sum/11;
		System.out.println("mean of the heights : " + mean);
	}
}
