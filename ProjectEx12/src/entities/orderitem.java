package entities;

public class orderitem {
	private String pname;
    private double price;
    private int quantity;

    public orderitem(String pname, double price, int quantity) {
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

	public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double subtotal() {
        return price * quantity;
    }
    
}
