package Abstract;

public class TestePessoa {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();// n�o pode ser instanciado
			
		Pessoa aluno = new Aluno();
			
		Pessoa professor = new Professor();
			
		//pessoa.setEndereco("Avenida Catanduva, 533");
		aluno.setEndereco("Avenida S�o Paulo, 50");
		professor.setEndereco("Avenida Brasil, 100");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

		
	}
}

