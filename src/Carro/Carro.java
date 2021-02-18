package Carro;

public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; //capacidade do tanque de combust�vel
	double consumoCombustivel; //consumo de combust�vel por km
	
	//m�todos
	//m�todo void n�o retorna nada	
	void exibirAutonomia() {		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "Km");
	}
	
	//utiliza o tipo de dado que ir� retornar no final do bloco de c�digo
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");		
		return capCombustivel * consumoCombustivel;
	}
	//km � um par�metro
	double calcularCombustivel(double km) {
		double qteCombustivel = km/consumoCombustivel;
		return qteCombustivel;
		
	}
	
	
	
}
