package core; 

import java.util.ArrayList; 

import java.util.List; 

import java.util.Scanner; 

 
 

public class Main { 

private int id; 

private String name; 

private double salary; 

 
 

public Main(int id, String nome, double salary) { 

this.id = id; 

this.name = nome; 

this.salary = salary; 

} 

 
 

public int getId() { 

return id; 

} 

 
 

public String getName() { 

return name; 

} 

 
 

public double getSalary() { 

return salary; 

} 

 
 

public void aumentarSalario(double percentagem) { 

salary += salary * (percentagem / 100); 

} 

 
 

 
 

public static void main(String[] args) { 

Scanner sc = new Scanner(System.in); 

List<Main> employees = new ArrayList<>(); 

 
 

System.out.print("How many employees will be registered? "); 

int num = sc.nextInt(); 

sc.nextLine(); 

 
 

for (int i = 0; i < num; i++) { 

System.out.println("Empregado #" + (i + 1)); 

System.out.println("Id: "); 

int id = sc.nextInt(); 

sc.nextLine(); 

 
 

System.out.print("Name: "); 

String name = sc.nextLine(); 

 
 

System.out.print("Salary: "); 

double salario = sc.nextDouble(); 

sc.nextLine(); 

 
 

employees.add(new Main(id, name, salario)); 

} 

 
 

System.out.println("Enter the employee id that will have salary increase : "); 

int idAumento = sc.nextInt(); 

sc.nextLine(); 

 
 

for (Main employee : employees) { 

if (employee.getId() == idAumento) { 

System.out.println("Enter the percentage: "); 

double percentagem = sc.nextDouble(); 

sc.nextLine(); 

employee.aumentarSalario(percentagem); 

break; 

} else{ 

System.out.println("This id does not exist!"); 

break; 

} 

} 

 
 

System.out.println("List of employees:"); 

for (Main employee : employees) { 

System.out.println("" + employee.getId() + ", " + employee.getName() + ", " + employee.getSalary()); 

} 

} 

} 