import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//ENTRADA 1
		String codA1 = "12"; //CÓDIGO DO PRODUTO
		String codB1 = "16";
		int quantA1 = 1; //QUANTIDADE DE PRODUTOS
		int quantB1 = 2;
		double valorA1 = 5.30; //VALOR DO PRODUTO
		double valorB1 = 5.10;
		double valorT1 = quantA1 * valorA1 + quantB1 * valorB1;; //VALOR FINAL A PAGAR
		System.out.printf("Código do produto: %s %n", codA1);
		System.out.printf("Quantidade de peças: %d %n", quantA1);
		System.out.printf("Valor unitário do produto: %.2f %n", valorA1);
		System.out.println();
		System.out.printf("Código do produto: %s %n", codB1);
		System.out.printf("Quantidade de peças: %d %n", quantB1);
		System.out.printf("Valor unitário do produto: %.2f %n", valorB1);
		System.out.println();
		System.out.printf("Valor a pagar pelos produtos %s e %s: R$%.2f %n", codA1, codB1, valorT1);
		System.out.println("-------------------------------------------------");
		
		//ENTRADA 2
		String codA2 = "13"; //CÓDIGO DO PRODUTO
		String codB2 = "161";
		int quantA2 = 2; //QUANTIDADE DE PRODUTOS
		int quantB2 = 4;
		double valorA2 = 15.30; //VALOR DO PRODUTO
		double valorB2 = 5.20;
		double valorT2 = quantA2 * valorA2 + quantB2 * valorB2;; //VALOR FINAL A PAGAR
		System.out.printf("Código do produto: %s %n", codA2);
		System.out.printf("Quantidade de peças: %d %n", quantA2);
		System.out.printf("Valor unitário do produto: %.2f %n", valorA2);
		System.out.println();
		System.out.printf("Código do produto: %s %n", codB2);
		System.out.printf("Quantidade de peças: %d %n", quantB2);
		System.out.printf("Valor unitário do produto: %.2f %n", valorB2);
		System.out.println();
		System.out.printf("Valor a pagar pelos produtos %s e %s: R$%.2f %n", codA2, codB2, valorT2);
		System.out.println("-------------------------------------------------");
		
		//ENTRADA 3
		String codA3 = "1"; //CÓDIGO DO PRODUTO
		String codB3 = "2";
		int quantA3 = 1; //QUANTIDADE DE PRODUTOS
		int quantB3 = 1;
		double valorA3 = 15.10; //VALOR DO PRODUTO
		double valorB3 = 15.10;
		double valorT3 = quantA3 * valorA3 + quantB3 * valorB3;; //VALOR FINAL A PAGAR
		System.out.printf("Código do produto: %s %n", codA3);
		System.out.printf("Quantidade de peças: %d %n", quantA3);
		System.out.printf("Valor unitário do produto: %.2f %n", valorA3);
		System.out.println();
		System.out.printf("Código do produto: %s %n", codB3);
		System.out.printf("Quantidade de peças: %d %n", quantB3);
		System.out.printf("Valor unitário do produto: %.2f %n", valorB3);
		System.out.println();
		System.out.printf("Valor a pagar pelos produtos %s e %s: R$%.2f %n", codA3, codB3, valorT3);
		System.out.println("-------------------------------------------------");
	}

}
