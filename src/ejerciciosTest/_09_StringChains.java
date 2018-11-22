package ejerciciosTest;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class _09_StringChains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		List<String> dictionary = new ArrayList<String>(size);
		scan.nextLine();

		// to read data input.
		for (int i = 0; i < size; i++) {
			dictionary.add(scan.nextLine());
		}
		
		scan.close();
		//new _09_StringChains().showArray(dictionary);
		
		int longestSize = longestChain(dictionary);
		System.out.println(longestSize);
	}
	
	private static int longestChain(List<String> dictionary) {
		Collections.sort(dictionary);
		int longestSize = 0;
		for (int i = 0; i < dictionary.size(); i++) {
			if(dictionary.get(i).length() == 1) {
				System.out.println(dictionary.get(i)+" is equals 1");
			}else {
				System.out.println(dictionary.get(i)+" isnt equals 1");
				String letter = dictionary.get(i);
				for (int j=0; j<letter.length(); j++) {
					String tempLetter = letter.substring(0, j);
				}
			}
		}
		return longestSize;
	}
	

	/**
	 * To show all elements of List
	 * @param dictionary
	 */
	private void showArray(List<String> dictionary) {
		for (String string : dictionary) {
			System.out.println(string);
		}
	}
}
