package Capacitacion;
import java.util.Scanner;

public class Recursividad {
	private static final Scanner scanner = new Scanner(System.in);	    

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.nextLine();
	        String line = scanner.nextLine();
	        String temp[] = line.split(" ");
	        System.out.println("Itearions: "+burbuja(temp, temp.length));
	        showArray(temp);
	        scanner.close();
	    }

	    public static int burbuja(String temp[], int size) {
	        int number = 0;
	        if (size== 0) {
	            return number;
	        }else {
	        	for (int i = 0; i < temp.length-1; i++) {
	                int num1 = Integer.parseInt(temp[i]);
	                int num2 = Integer.parseInt(temp[i + 1]);
	                if (num1 > num2) {
	                    temp[i + 1] = String.valueOf(num1);
	                    temp[i] = String.valueOf(num2);
	                    ++number;
	                    number += burbuja(temp, size - 1);
	                }
	            }
	        }
	        return number;
	    }
	    
	    
	    public static void showArray(String temp[]){
	        for(int i=0; i<temp.length; i++){
	            System.out.print(temp[i]+" ");
	        }

	}

}
