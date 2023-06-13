package conversao;

import java.util.Scanner;

import conversao.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conversao = new CurrencyConverter();
		
		System.out.println("What is the dollar price?: ");
		conversao.dolar = sc.nextDouble();
		System.out.println("How many dollares will be bought?: ");
		conversao.quantidade = sc.nextDouble();
		System.out.printf("Amount to be paid in euros = %.2f", conversao.total());
		
	}

}
