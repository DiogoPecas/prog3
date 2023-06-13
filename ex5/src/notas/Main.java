package notas;

import java.util.Scanner;

import entities.student;

public class Main {
	
	static double diferenca;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		student notas = new student();
		
		System.out.println("Introduza o seu nome: ");
		notas.Nome = sc.nextLine();
		System.out.println("Introduza a nota do 1ºtrimestre: ");
		notas.trimestre1 = sc.nextDouble();
		System.out.println("Introduza a nota do 2ºtrimestre: ");
		notas.trimestre2 = sc.nextDouble();
		System.out.println("Introduza a nota do 3ºtrimestre: ");
		notas.trimestre3 = sc.nextDouble();
		
		if(notas.trimestre1 > 30 || notas.trimestre2 > 35 || notas.trimestre3 > 35) {
			System.out.println("Notas inválida(s)");
		}
		
		System.out.println("FINAL GRADE: " + notas.notatotal());
		System.out.println("" +notas.pass());
		if(notas.notatotal() < 60) {
			diferenca =  60 - notas.notatotal();
			System.out.printf("MISSING %.2f POINTS", diferenca);
		}
	}

}
