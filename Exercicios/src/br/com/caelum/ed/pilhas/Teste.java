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
			System.out.println("Erro: a pe�a removida n�o � igual a que foi inserida");
		}
		
		if (!pilha.vazia()) {
			System.out.println("Erro: A pilha n�o est� vazia");
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		
	}
}