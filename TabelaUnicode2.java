package br.com.tlmtech.teste;

import java.io.*;

public class TabelaUnicode2 {

	public static void main(String[] args) throws IOException {

		FileWriter arquivo = new FileWriter("tabela_ascii.txt");
		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		gravaArquivo.println("+----------------------------+");
		gravaArquivo.println("| ...:::::TABELA ACII:::::...|");
		gravaArquivo.println("+----------------------------+");
		System.out.println("+----------------------------+");
		System.out.println("| ...:::::TABELA ACII:::::...|");
		System.out.println("+----------------------------+");
		for (int i = 0; i < 256; i++) {
			String hexadecimal = Integer.toHexString(i);
			gravaArquivo.println("| Dec |" + i + "| Hexa |" + hexadecimal + "| Simbolo |" + (char) i);
			System.out.println("| Dec |" + i + "| Hexa |" + hexadecimal + "| Simbolo |" + (char) i);
		}
		gravaArquivo.println("+----------------------------+");
		System.out.println("+----------------------------+");
		System.out.println("Tabela ASCII gravada em tabela_ascii.txt");
	}
}
