package LoopWhile;

import java.util.Scanner;

public class Ex2 {

// 2. Scrie un program care afiseaza suma numerelor de la 1 la n.
//Variatie de cerinta: "Scrie un program care afiseaza primele suma primelor n numere din intervalul [x,y].
//Dupa ce rezolvi direct in main, poti scrie o metoda care sa rezolve problema.

    public static void main(String[] args) {

// Citirea datelor de la utilizator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n:");
        int n = scanner.nextInt();
        System.out.println("Introduceti valoarea lui x :");
        int x = scanner.nextInt();
        System.out.println("introduceti valoarea lui y :");
        int y = scanner.nextInt();

// Calcularea sumei primelor n numere in interalul [x, y]


        int suma = 0;
        int contor = 0;
        int curent = x;

        while (contor<n && curent <= y ){

            suma += curent;
            curent++;
            contor++;

        }
  // Afisarea rezultatului

        System.out.println("Suma primelor "+ n + "numere din interval["+x +", "+  y + "] este:"+ suma );

        scanner.close();

    }

}
