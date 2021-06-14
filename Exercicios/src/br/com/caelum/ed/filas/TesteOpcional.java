package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteOpcional {
	
	public static void main(String[] args) {
		
	
		FilaParametrizada<Aluno> filaAlunos = new FilaParametrizada<Aluno>();
		
		int numeroAlunos = 40000;
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroAlunos; i++) {
			Aluno aluno = new Aluno();
			filaAlunos.insere(aluno);
		}
		
		for(int i = 0; i < numeroAlunos; i++) {
			filaAlunos.remove();
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo ao adicionar e remover 40000 alunos: " + (fim - inicio) / 1000.0);
		
		
	}
}
