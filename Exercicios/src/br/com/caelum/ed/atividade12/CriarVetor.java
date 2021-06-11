package br.com.caelum.ed.atividade12;

import java.util.ArrayList;
import java.util.Vector;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class CriarVetor {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		
		System.out.println(vetor.tamanho());
		
		for(int i = 0; i< 1000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		System.out.println(vetor.tamanho());
		
		Vector vetorVector = new Vector();
		
		System.out.println(vetorVector.size());
		
		for(int i = 0; i< vetor.tamanho(); i++) {
			vetorVector.add(vetor.pega(i));
		}
		
		System.out.println(vetorVector.size());
		
		ArrayList vetorArrayList = new ArrayList();
		
		System.out.println(vetorArrayList.size());
		
		for(int i = 0; i < vetorVector.size(); i++) {
			vetorArrayList.add(vetorVector.get(i));
		}
		
		System.out.println(vetorArrayList.size());
	}
	

}
