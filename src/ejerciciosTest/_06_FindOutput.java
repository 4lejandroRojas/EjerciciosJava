package ejerciciosTest;

public class _06_FindOutput {
	static String str; //null

	//Tener en cuenta que este no es el constructor. Debe ir sin "void".
	public void _06_FindOut() {
		System.out.println("In constructor");
		str = "Hello World";
	}

	
	
	public static void main(String[] args) {
		_06_FindOutput c = new _06_FindOutput();
		System.out.println(str);

	}

}
