package core_package;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double preco, precototal;
		System.out.print("Insire o código do item:");
		codigo = sc.nextInt();
		System.out.print("Insire a quantidade do item:");
		quantidade = sc.nextInt();
		switch(codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		default:
			System.out.println("Código inválido!");
			return;
		}
		
		precototal = preco * quantidade;
		
		System.out.printf("Valor da compra: %.2f", precototal);
	}
}
