package CarroThis;

public class Carro2 {
	
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	double consumoCombustivel; 
	
	public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro2() {
	}
	
	public Carro2(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 par�metros");
	}

	public Carro2(String marca, String modelo) {
		this(marca,modelo, 10);
		System.out.println("Chamando o construtor com 2 par�metros");
		
	}
	
	void exibirAutonomia() {		
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + "Km");
	}
	
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qteCombustivel = km/this.consumoCombustivel;
		return qteCombustivel;
	}
}	