package Livro;

public class Ex03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane.Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Pre�o do livro: " + livro.preco);
		
	}

}
