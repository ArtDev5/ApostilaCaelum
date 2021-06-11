package br.com.caelum.ed.listasligadas;

public class TesteTamanhoListaLigada {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.tamanho());
		
		lista.adiciona("Camila");
		
		System.out.println(lista.tamanho());
	}
}
