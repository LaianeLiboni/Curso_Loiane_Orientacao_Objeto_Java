package Alunos;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.setNome(scanner.next());
		
		System.out.println("Entre com o nome do curso: ");
		aluno.setNomeCurso(scanner.next());
		
		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(scanner.next());
		
		//aluno.nomeDisciplinas = new String[4];
		for (int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome das disciplinas: " + i);
			aluno.setNomeDisciplinaPos(i,scanner.next());
		}
		
		for (int i=0; i<aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas das disciplinas: " + aluno.getNomeDisciplinas()[i]);
			for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
			aluno.setNomePosIJ(i,j,scanner.nextDouble());
			}
		}
		
		aluno.mostrarInformacao();
		
		for (int i = 0; i<aluno.getNomeDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			}else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi reprovado") ;
			}
		}
		scanner.close();
			
	}

}
