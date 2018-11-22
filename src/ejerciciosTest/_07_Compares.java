package ejerciciosTest;
import java.util.*;

public class _07_Compares {

	public static void main(String[] args) {
		String[] cities = {"Bangalore", "Pune", "San Francisco", "New York City"};
		MySort ms = new MySort();
		Arrays.sort(cities, ms);
		System.out.println(Arrays.binarySearch(cities, "New York City"));

	}
	static class MySort implements Comparator
	{
		//No se sobrecarga, es necesario que los miembros sean Object
		public int compare(String a, String b) {
			return b.compareTo(a);
		}

		@Override
		public int compare(Object o1, Object o2) {
			String a = String.valueOf(o1);
			String b = String.valueOf(o2);
			return b.compareTo(a);
		}

	}
	

}
