package br.com.caelum.ed.vetores.opcionais;

public class atividade {
	public static void main(String[] args) {
		
		ListaOpcional vetor = new ListaOpcional();
		String oi = "oi";
		
		vetor.adiciona(oi);
		
		int teste = 10;
		
		vetor.adiciona(teste);
		vetor.adiciona(teste);
		vetor.adiciona(oi);
		vetor.adiciona(teste);
		
		vetor.indexOf(10);
		vetor.lastIndexOf("oi");
//		vetor.clear();
		vetor.remove(teste);
	}
}
