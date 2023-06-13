package core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        String nome = sc.next();
        System.out.println("Is there an initial deposit (Yes/No)?");
        String yn = sc.next();
        
        switch(yn) {
        case "Yes":
        	System.out.println("Enter initial deposit value: ");
        	double initial = sc.nextDouble();
        	System.out.println("Account data:\nAccount " + numeroConta + ",Holder: " + nome + ", Balance: " + initial);
        	System.out.println("Enter a deposit value: ");
        	double deposit = sc.nextDouble();
        	System.out.println("Updated account data:\nAccount " + numeroConta + ", Holder: " + nome + ", Balance: " + (initial + deposit));
        	System.out.println("Enter a withdraw value: ");
        	double withdraw = sc.nextDouble();
        	System.out.println("Updated account data:\nAccount " + numeroConta + ", Holder: " + nome + ", Balance: " + (initial + deposit - withdraw - 5));
        	
        	break;
        case "No":
        	initial = 0;
        	System.out.println("Account data:\nAccount " + numeroConta + ",Holder: " + nome + ", Balance: " + initial );
        	System.out.println("Enter a deposit value: ");
        	double deposit1 = sc.nextDouble();
        	System.out.println("Updated account data:\nAccount " + numeroConta + ", Holder: " + nome + ", Balance: " + (initial + deposit1));
        	System.out.println("Enter a withdraw value: ");
        	double withdraw1 = sc.nextDouble();
        	System.out.println("Updated account data:\nAccount " + numeroConta + ", Holder: " + nome + ", Balance: " + (initial + deposit1 - withdraw1 - 5));
        	break;
        default:
        	System.out.println("Erro");
        }
    }
}
