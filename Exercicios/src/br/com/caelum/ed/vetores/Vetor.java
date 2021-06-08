package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100000];
	
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		for(int i = this.totalDeAlunos - 1; i >= posicao; i--) {
			this.alunos[i+1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	public Aluno pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.alunos[posicao];
		
	}
	
	public void remove(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		for(int i = posicao; i < this.totalDeAlunos-1;i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		
		this.totalDeAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i< this.totalDeAlunos; i++) {
			if(aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}
	
	private void garantaEspaco() {
		if(this.totalDeAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length * 2];
			for(int i = 0; i< this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			
			this.alunos = novoArray;
		}
	}

}
