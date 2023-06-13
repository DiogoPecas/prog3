package entities;

public class employee {
	public String name;
	public int hours;
	public double value;
	public double charge;
	public boolean outsourced;

	public employee(String name, int hours, double value, double charge, boolean outsourced) {
		this.name = name;
		this.hours = hours;
		this.value = value;
		this.charge = charge;
		this.outsourced = outsourced;
	}
	
	public String getName() {
		return name;
	}
	 public double calculatePayment() {
	        double Payment = hours * value;
	        double totalPayment = outsourced ? (Payment + charge) : Payment;
	        return totalPayment;
	 }
	
}


