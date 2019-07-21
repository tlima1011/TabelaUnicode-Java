package br.com.tlmtech.teste;

public class TabelaUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("+--------------------------+");
		System.out.println("|...::::TABELA UNICODE::::...|");
		System.out.println("+--------------------------+");
		for (int i = 0; i < 256; i++) {
			System.out.println("|Dec|" + i + "|Sinal|" + (char) i);
		}
		System.out.println("+--------------------------+");
	}
}
