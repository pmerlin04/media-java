package comandoJOption;
import java.util.Scanner;
import java.util.jar.JarOutputStream;
import javax.swing.JOptionPane;

public class Aula1911 {

	public static void main(String[] args) {
		String nome, opcoes[] = {"Sim", "N�o"}, exemploSwitch[] = {"Assistir", "Gravar", "Sair"};
		int opcao;
		float n1, n2, n3, n4;
		double media, soma;
	
		
		/*opcao = JOptionPane.showOptionDialog(null, "Escolha uma a��o:", "MENU", 0, JOptionPane.PLAIN_MESSAGE,
				null, exemploSwitch, exemploSwitch[0]);
		
		
		switch (opcao) {
		case 0:
			System.out.println("ASSISTINDO!");
			break;
		case 1:
			System.out.println("GRAVANDO!");
			break;
		case 2:
			System.out.println("SAINDO");
			break;
		
		}*/
		
		
		
		
		
		opcao = JOptionPane.showOptionDialog(null, "Deseja calcular a m�dia de um aluno?", "MENU", 0, JOptionPane.PLAIN_MESSAGE,
				null, opcoes, opcoes[0]);
		
		while(opcao==0){
			nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno", "ENTRADA", JOptionPane.QUESTION_MESSAGE);
			n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 1� nota", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
			n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 2� nota", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
			n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 3� nota", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
			n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 4� nota", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
			soma = (n1 + n2 + n3 + n4);
			media = (soma/4);
			JOptionPane.showMessageDialog(null, "M�dia: " + media, "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			if(media >= 5) {
				JOptionPane.showMessageDialog(null, "voc� passou de ano com a nota " + media);
			}else {
				JOptionPane.showMessageDialog(null, "voc� reprovou com a nota " + media);
			}
			opcao = JOptionPane.showOptionDialog(null, "Deseja continuar?", "MENU", 0, JOptionPane.PLAIN_MESSAGE,
					null, opcoes, opcoes[0]);
		

	}
}
}
