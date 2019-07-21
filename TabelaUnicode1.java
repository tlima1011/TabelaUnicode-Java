package br.com.tlmtech.teste;

import javax.swing.JOptionPane;

public class TabelaUnicode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("+--------------------------+\n");
		mensagem.append("|...::::TABELA ASCII::::...|\n");
		mensagem.append("+--------------------------+\n");
		for (int i = 0; i < 256; i++) {
			mensagem.append("|Dec|" + i + "|Sinal|" + (char) i+"\n");
		}
		mensagem.append("+--------------------------+\n");
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
	}

}
