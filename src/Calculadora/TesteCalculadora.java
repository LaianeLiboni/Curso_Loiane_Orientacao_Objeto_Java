package Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		int soma1 = MinhaCalculadora.soma(1, 2);
		System.out.println(soma1);
		
		int soma2 = MinhaCalculadora.soma(1, 2, 2);
		System.out.println(soma2);
		
	}	

}
