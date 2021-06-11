package br.com.caelum.ed.vetores.opcionais;

import java.util.ArrayList;


public class ListaOpcional {
	
	ArrayList vetor = new ArrayList();
	
	public void remove(Object objeto) {
		for(int i = 0; i < vetor.size(); i++) {
			if(this.vetor.get(i).equals(objeto)) {
				this.vetor.remove(i);
				i = 0;
			}
		}
		System.out.println(this.vetor);
	}
	
	public void clear() {
		int size = this.vetor.size();
		for(int i = 0; i < size; i++) {
			this.vetor.remove(0);
		}
		System.out.println(this.vetor);
	}
	
	public void indexOf(Object objeto) {
		for(int i = 0; i < this.vetor.size(); i++) {
			if(vetor.get(i).equals(objeto)) {
				System.out.println(i);
				i = this.vetor.size();
			}
		}
	}
	
	public void lastIndexOf(Object objeto) {
		for(int i = this.vetor.size()-1; i >= 0; i--) {
			if(this.vetor.get(i).equals(objeto)) {
				System.out.println(i);
				i = 0;
			}
		}
	}
	
	public void adiciona(Object objeto) {
		this.vetor.add(objeto);
	}
}
