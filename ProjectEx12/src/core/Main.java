package core;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.*;
import entities.*;

public class Main {
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		Scanner sc = new Scanner(System.in);
		List<orderitem> orderItems = new ArrayList<>();
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY):");
		String birthdate = sc.nextLine();
		System.out.println("Enter order data:\n");
		System.out.println("Status: ");
		String status = sc.nextLine();
		
		System.out.println("How many items to this order? ");
		int num = sc.nextInt();
		
		for (int i = 0 ; i < num; i++) {
			System.out.println("Enter #" + (i+1) + " item data\n");
			System.out.println("Product name:");
			String pname = sc.nextLine();
			sc.nextLine();
			System.out.println("Product price:");
			double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			orderItems.add(new orderitem(pname, price, quantity));
	
		}
		
		System.out.println("Order Summary:\nOrder moment: " + dtf.format(now));
		System.out.println("Order status: " + status);
		System.out.println("Client: " + name + "(" + birthdate + ") - " + email + "\nOrder items:\n");
		
		double total = 0.0;
		
		for (orderitem product : orderItems) {
			System.out.println("" + product.getPname() + ", ");
			System.out.println("$" + product.getPrice() + ", ");
			System.out.println(", Quantity: " + product.getQuantity() + ", ");
			System.out.println(", Subtotal: $" + product.subtotal());
			System.out.println();
			total += product.subtotal();
		}
		
		System.out.println("Total price: $" + total);
		
		}
		
	}