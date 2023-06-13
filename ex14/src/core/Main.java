package core;

import java.util.ArrayList;
import java.util.List;

class Stand {
    private List<Carro> carros;
    
    public Stand() {
        carros = new ArrayList<>();
    }
    
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }
    
    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }
    
    public List<Carro> getCarros() {
        return carros;
    }
}

public class Main {
    public static void main(String[] args) {
        Stand stand = new Stand();
        
        Carro carro1 = new CarroImpl("Ford Fiesta", 2019, 50000);
        Carro carro2 = new CarroImpl("Volkswagen Golf", 2017, 80000);
        Carro carro3 = new CarroImpl("Renault Clio", 2020, 30000);
        
        stand.adicionarCarro(carro1);
        stand.adicionarCarro(carro2);
    }
}



