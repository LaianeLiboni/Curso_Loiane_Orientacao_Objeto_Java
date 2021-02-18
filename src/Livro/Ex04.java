package Livro;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane.Groner";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoPara = "Laiane";
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Emprestado para: " + livro.emprestadoPara);
		
	}

}
