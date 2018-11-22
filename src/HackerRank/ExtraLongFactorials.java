package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;


public class ExtraLongFactorials {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Validate input
        if(n>=1 && n<=100){
            System.out.println(extraLongFactorials(n));
        }else{
            System.out.println("Error");
        }
        
        scanner.close();

	}
	
	// Complete the extraLongFactorials function below.
    static BigInteger extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.ZERO;
        if(n==1){
            factorial = BigInteger.ONE;
        }else{
            factorial = factorial.add(BigInteger.valueOf(n).multiply(extraLongFactorials(n-1)));
        }
        return factorial;
    }

}
