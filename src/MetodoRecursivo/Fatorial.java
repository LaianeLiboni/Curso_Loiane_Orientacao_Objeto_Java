package MetodoRecursivo;

public class Fatorial {
	
	//m�todo n�o recursivo
	
	public static int FatorialN�oRecursivo(int num) {
		
		if(num == 0) {
			return 1;
		}
	
		int total = 1;
	
		for (int i = num; i >1; i--) {
			total *= i;
		}
		return total;
	}
	
	//m�todo recursivo

	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num* fatorial(num-1);
		
	}

	
}

	