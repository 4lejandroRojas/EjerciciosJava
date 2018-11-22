package ejerciciosTest;

public class _03_MultipleChoice {

	static void TestFirstApp(int x, int y, int m){
		if(x == 5) m=y;
		else m=x;
	}
	public static void main(String[] args) {
		int i=6, j=4, k=9;
		_03_MultipleChoice.TestFirstApp(i, j, k);
		System.out.println(k);

	}

}
