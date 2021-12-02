package z_teste_estagio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var notalist = new ArrayList<Float>();
		
		var notaFinallist = new ArrayList<Float>();
		
		int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Vai entrar com a nota de quantos alunos?"));
		
		float somaNotas = 0;
		float mediaFinalNotas = 0;
		
		for(int i=1; i <= qtdAlunos; i++) {

			notalist.add(Tools.nota("1"));
			notalist.add(Tools.nota("2"));
			notalist.add(Tools.nota("3"));
			
			Float media = (notalist.get(0) + notalist.get(1) + notalist.get(2)) / 3;
			
			notaFinallist.add(media);
			
			notalist.clear();
		
		}
		
		for(int i=0; i<notaFinallist.size();i++) {
			somaNotas = somaNotas + notaFinallist.get(i);
		}
		
		mediaFinalNotas = somaNotas / Float.parseFloat(qtdAlunos+"");
		
		System.out.print(""+mediaFinalNotas);
		
		for(int i=1; i <= qtdAlunos; i++) {

			
		}
	}

}
