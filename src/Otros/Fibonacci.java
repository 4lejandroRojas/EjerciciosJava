package Otros;

/**
 * To practice Fibonacci Serie
 * @author 4lejandroRojas
 *
 */
public class Fibonacci {

	public static void main(String []args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		final int size = scan.nextInt();
		
		//To print serie
		for(int i=0; i<size; i++) {
			System.out.printf("%d ",doIt(i));
		}
		System.out.println("\nFinal fibonacci number is: "+doIt(size));
		
	}
	
	private static int doIt(int n) {
		int Fibonacci = 0;
		if(n<=0) {
			Fibonacci = 0;
		}else if(n==1) {
			Fibonacci = 1;
		}else {
			Fibonacci += doIt(n-1) + doIt(n-2);
		}
		return Fibonacci;
	}
	
}
