package Contato;

public class TesteContato {

	public static void main(String[] args) {
		
		//relacionameto tem-um-endere�o
		Contato contato = new Contato();
		contato.setNome("Francisca");
		//contato.setEndereco("Rua S�o Paulo, n/a");
		//contato.setTelefone("99999-9999");
		
		//criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua S�o Paulo");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Araraquara");
		end.setEstado("S�o Paulo");
		end.setCep("14811-823");
		
		contato.setEndereco(end);
		
		
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("016");
		telefone.setNumero("99999-9999");
		
		contato.setTelefone(telefone);
		
		//Teste sa�da no console		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}

	}

}
