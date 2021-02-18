package Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		//instancia��o
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		System.out.println("A autonomia do carro �: " + van.obterAutonomia());
		
		double qteCombustivel10 = van.calcularCombustivel(10);
		double qteCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qteCombustivel10 = " + qteCombustivel10);
		System.out.println("qteCombustivel15 = " + qteCombustivel15);
		
		System.out.println("");
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		System.out.println(fusca.consumoCombustivel);
		
	}

}
