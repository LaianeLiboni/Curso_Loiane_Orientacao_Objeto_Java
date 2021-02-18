package Carro;

public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; //capacidade do tanque de combustível
	double consumoCombustivel; //consumo de combustível por km
	
	//métodos
	//método void não retorna nada	
	void exibirAutonomia() {		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "Km");
	}
	
	//utiliza o tipo de dado que irá retornar no final do bloco de código
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");		
		return capCombustivel * consumoCombustivel;
	}
	//km é um parâmetro
	double calcularCombustivel(double km) {
		double qteCombustivel = km/consumoCombustivel;
		return qteCombustivel;
		
	}
	
	
	
}
