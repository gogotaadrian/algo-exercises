package Conditionals;

import java.util.Scanner;

public class Ex1 {
//### 1. [LIVE] Citeste de la tastatura doua numere si afiseaza-l la consola pe cel mai mare dintre ele.
//De exemplu, pentru valorie initiale:
//int a = 13;
//int b = 14;
//programul ar trebui sa afiseze in consola valoarea 14
//HINT1: poti afisa valoarea impreuna cu un mesaj corespunzator folosind operatorul "+".
//de exemplu, linia de cod:
// System.out.println("numarul mai mai mare este " + b)
//va afisa in consola textul "numarul mai mare este 14", pentru ca Java concateneaza valoarea 14 cu String-ul "numarul mai mare este", rezultand un nou String
//HINT2: Ar putea exista cazuri la care nu ne-am gandit? Daca da, trateaza-le.

    public static void main(String[] args) {

// Citirea datelor de la utilizator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int b = scanner.nextInt();

// Compara numerele si afisarea celui mai mare numar


        if (a>b) {

            System.out.println("Numarul mai mare este " + a );
            
        } else if (b>a) {
            System.out.println("Numarul mai mare este " + b );
            
        } else {
            System.out.println("Numerele sunt egale:" + a );

        }
        scanner.close();


    }






}
