import java.util.*;

class HandshakesNum{
	public static int getHandshake(int n ){
		return (n*(n-1))/2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num of student");
		int n = sc.nextInt();
		int handshakes = getHandshake(n);
		System.out.println("max number of handshake " + n + "student is :" + handshakes);
	}
}