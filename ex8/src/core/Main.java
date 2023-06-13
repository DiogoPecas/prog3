package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int nrooms = sc.nextInt();

        String[] names = new String[nrooms];
        String[] emails = new String[nrooms];
        int[] room = new int[nrooms];
        System.out.print("\n");

        for (int i = 0; i < nrooms; i++) {
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Email: ");
            emails[i] = sc.next();
            System.out.print("Room: \n");
            room[i] = sc.nextInt();
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < nrooms; i++) {
                System.out.printf("%d: %s, %s\n", room[i], names[i], emails[i]);
            }
    }
}