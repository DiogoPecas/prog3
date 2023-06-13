package core;

public class CarroImpl implements Carro{
	public String modelo;
	public int ano;
	public int kilometragem;
	
	public CarroImpl(String modelo, int ano, int kilometragem) {
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
    }
	
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getKilometragem() {
        return kilometragem;
    }
}
