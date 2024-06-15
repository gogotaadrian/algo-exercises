package LoopWhile;

import java.util.Scanner;

public class Ex1 {

 //1. Scrie un program care afiseaza numerele de la 1 la n, n fiind citit de la tastatura


    public static void main(String[] args) {

// 1. Initializam cititorul de la tastatura

        Scanner scanner = new Scanner(System.in);

// 2. Afisam mesajul "Introducem un numar n:"

        System.out.println("Introduceti un numar n:");

// 3. Citeste numarul intreg n de la tastatura

        int n = scanner.nextInt();

// 4. Seteaza variabila i la 1


        int i = 1;

// 5. Repeta pasii urmatori pana pana i este mai mic sau egal cu n


        while (i<=n){

// 5.1. Afiseaza valoarea lui i

            System.out.println(i);

// 5.2. Incrementeaza valoarea lui i cu 1


         i++;

        }
// 6. Inchide cititorul

      scanner.close();





    }

}
