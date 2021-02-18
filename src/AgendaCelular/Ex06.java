package AgendaCelular;

public class Ex06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Diva";
		contato1.endereco = "Av Catanduva, 533";
		contato1.email = "diva@gmail.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
		
		System.out.println("O endereço de " + contato1.nome + " é " + contato1.endereco);
		System.out.println("O email de " + contato1.nome + " é " + contato1.email);
	}
	
}
