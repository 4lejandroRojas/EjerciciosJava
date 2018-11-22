package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class FormingMagicSquare {

	// Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int cost = 0;
        for(int i=0;i<3;i++){
            //for(int j=0; j<3;j++){
        	
                System.out.printf("%d ",s[i][0]);
                System.out.printf("%d ",s[i][1]);
                System.out.printf("%d ",s[i][2]);
                
                System.out.println("----------------------------------");
                
            //}
            System.out.println();
        }
        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
