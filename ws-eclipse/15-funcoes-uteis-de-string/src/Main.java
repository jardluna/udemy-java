
public class Main {
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		System.out.println("Original: -" + original + "-");
		
		//Deixa todas as letras minusculas.
		String s01 = original.toLowerCase();
		System.out.println("1: -" + s01 + "-");
		
		//Deixa todas as letras maiusculas.
		String s02 = original.toUpperCase();
		System.out.println("2: -" + s02 + "-");
		
		//Apaga os espaços em branco nos cantos da String.
		String s03 = original.trim();
		System.out.println("1: -" + s03 + "-");
		
		//Mostra apenas o conteúdo da String que está depois do caractere selecionado (2).
		String s04 = original.substring(2);
		System.out.println("1: -" + s04 + "-");
		
		//Mostra apenas o conteúdo da String que está entre os caracteres selecionados (2 e 9).
		String s05 = original.substring(2, 9);
		System.out.println("1: -" + s05 + "-");
		
		//Substitui um caractere selecionado ('a') por outro selecionado ('X').
		String s06 = original.replace('a', 'X');
		System.out.println("1: -" + s06 + "-");
		
		//Substitui um substring selecionado ('abc') por outro selecionado ('yz').
		String s07 = original.replace("abc", "xy");
		System.out.println("1: -" + s07 + "-");
		
		//Mostra a posicão do primeiro caractere ou substring selecionado ("bc") de dentro da String (começa a partir da posiçao 1).
		int s08 = original.indexOf("bc");
		System.out.println("1: -" + s08 + "-");
		
		//Mostra a posicão do ultimo caractere ou substring selecionado ("bc") de dentro da String (começa a partir da posiçao 1).
		int s09 = original.lastIndexOf("bc");
		System.out.println("1: -" + s09 + "-");
		
		
	}
}
