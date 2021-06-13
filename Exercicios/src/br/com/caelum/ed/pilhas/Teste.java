package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class Teste {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		Pilha pilha = new Pilha();
		
		Peca peca = new Peca();
		pilha.insere(peca);
		
		Peca pecaRemovida = pilha.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a peça removida não é igual a que foi inserida");
		}
		
		if (!pilha.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		
	}
}