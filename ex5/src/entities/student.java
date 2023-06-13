package entities;

public class student {
	public String Nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	public double diferenca;
	public String pass;
	
	public double notatotal() {
		return trimestre1 + trimestre2 + trimestre3; 
	}
	
	public String pass() {
		if (notatotal() > 60) {
			pass = "PASS";
		} else {
			pass = "FAILED";
		}
		return pass;
	}
	
}

