package core_package;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, alcool = 0, gasolina = 0, diesel = 0;
		
		do {
			System.out.println(" 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n");
			System.out.println("Selecione com o que pretende abastecer o seu veículo: 1");
            codigo = sc.nextInt();

            while (codigo < 1 || codigo > 4) {
                System.out.println("Código inválido. Digite novamente.");
                codigo = sc.nextInt();
            }

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }

}
