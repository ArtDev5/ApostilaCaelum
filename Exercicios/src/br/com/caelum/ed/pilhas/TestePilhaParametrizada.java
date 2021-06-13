package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaParametrizada {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		
		Peca peca = new Peca();
		
		pilhaDePecas.insere(peca);
		Peca pecaRemovida = pilhaDePecas.remove();

		if(peca != pecaRemovida){
			System.out.println("Erro: a peça removida não é igual a que foi inserida");
		}
		
		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		
		}
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		
		pilhaDeString.insere("Rafael Cosentino");
		pilhaDeString.insere("Paulo Silveira");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		
		
	}
}