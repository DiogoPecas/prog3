package core;

public class ContaBancaria {
	
	private static String nome;
    private static int numeroConta;
    private static double saldo;
    private static String yn;
    private static double initial;
    private static double deposit;
    private static double withdraw;
    
    public ContaBancaria(String nome, int numeroConta, double saldo, String yn, double initial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.yn = yn;
        this.initial = initial;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public static String getNome() {
        return nome;
    }

    public static int getNumeroConta() {
        return numeroConta;
    }

    public static double getSaldo() {
        return saldo;
    }
    
    public static String yn() {
    	return yn;
    }

}
