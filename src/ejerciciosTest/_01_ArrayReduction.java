
package ejerciciosTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _01_ArrayReduction {

	/**
	 * Read n numbers and determine the lowest cost.
	 * Date: 12-Nov-18
	 */
	public static void main(String args[]) {
		//Initialize input
		Scanner scanner = new Scanner(System.in);
		
		int sizeArr= scanner.nextInt(); //Read input size
		List<Integer> num = new ArrayList<Integer>(sizeArr);//Declarate list and set size
		
		//To read items
		for(int i=0;i<sizeArr;i++) {
			num.add(scanner.nextInt());
		}
		scanner.close();//close date input
		
		
		
		//Invocate reductionCost
		System.out.println(reductionCost(num));
		
	}
	public static int reductionCost(List<Integer> num) {
		List<Integer> num2 = new ArrayList<Integer>(3);
		int cost = 0;
		for(int i=0; i<num.size(); i++) {
			if (num.size() >= 2) {
				Collections.sort(num);
				int item1 = num.get(0);
				int item2 = num.get(1);
				num.remove(0);
				num.remove(0);
				/*
				System.out.println("item 1: " + item1);
				System.out.println("item 2: " + item2);
				*/
				num.add(item1 + item2);
				cost += item1 + item2;
				i--;
				//System.out.println("Last sum: " + (item1 + item2));
				//System.out.println("cost: " + cost);

			} else {
				num2.add(num.get(0));
				//System.out.println("costo = " + cost);
				return cost;
			}
		}
		return 1;
	}
	
	private static void showArrNum(List<Integer> num) {
		for(int i=0; i<num.size(); i++) {
			System.out.println("item: ["+i+"] "+num.get(i));
		}
	}
}
