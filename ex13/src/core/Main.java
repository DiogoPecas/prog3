package core;

import java.util.*;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();
        sc.nextLine();

        List<employee> employees = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced(y/n)?");
            String yn = sc.nextLine();
            boolean yn2 = yn.equalsIgnoreCase("y");
      
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            double charge = 0.0;
            if (yn2) {
                System.out.print("Additional charge: ");
                charge = sc.nextDouble();
            }

            sc.nextLine();

            employee empregado = new employee(name, hours, value, charge, yn2);
            employees.add(empregado);
        }

        System.out.println("\nEmployee Payments:");
        for (employee employee : employees) {
            System.out.println("" + employee.getName() + "$ " + employee.calculatePayment());
            System.out.println();
        }
    }
}
