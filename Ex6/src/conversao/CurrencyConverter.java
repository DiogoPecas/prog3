package conversao;

public class CurrencyConverter {
	public double dolar;
	public double quantidade;
	
	public double preco() {
		return dolar * quantidade;
	}
	
	public double taxa() {
		return preco() * 0.06;
	}
	
	public double total() {
		return preco() + taxa();
	}
}
