package EncapsulamentoCarro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.setMarca("Fiat");//m�todo set atribui valor
		
		System.out.println(van.getMarca());// m�todo get obt�m valor
		
		van.setModelo("Ducato");
		
		System.out.println(van.getModelo());
		
		van.setNumPassageiros(10);
		
		System.out.println(van.getNumPassageiros());
		
	}

}
