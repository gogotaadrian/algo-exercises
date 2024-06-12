package VariabileOperatori;

import java.util.Scanner;

public class Ex1 {


//1. [LIVE] Scrie un program care sa citeasca de la tastatura numele tau, iar apoi sa afiseze mesajul “Salut”, urmat de numele tau.




    public static void main(String[] args) {

// Scriem o linie de cod pri care sa permitem sa fie citi input-ul de la tastatura

        Scanner scanner = new Scanner(System.in);

// Solicitarea numelui utilizatorului( punem sa introduca un nume de latastatura)

        System.out.println("Te rog introdu numele tau:");
        String name = scanner.nextLine();

// Dupa care afisam mesajul de salut


        System.out.println("Salut," + name + "!");


          }

      }

