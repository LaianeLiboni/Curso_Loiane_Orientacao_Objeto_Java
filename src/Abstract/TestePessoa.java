package Abstract;

public class TestePessoa {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();// não pode ser instanciado
			
		Pessoa aluno = new Aluno();
			
		Pessoa professor = new Professor();
			
		//pessoa.setEndereco("Avenida Catanduva, 533");
		aluno.setEndereco("Avenida São Paulo, 50");
		professor.setEndereco("Avenida Brasil, 100");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

		
	}
}

