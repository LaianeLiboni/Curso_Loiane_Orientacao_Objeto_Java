package MetodoRecursivo;

public class Fatorial {
	
	//método não recursivo
	
	public static int FatorialNãoRecursivo(int num) {
		
		if(num == 0) {
			return 1;
		}
	
		int total = 1;
	
		for (int i = num; i >1; i--) {
			total *= i;
		}
		return total;
	}
	
	//método recursivo

	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num* fatorial(num-1);
		
	}

	
}

	