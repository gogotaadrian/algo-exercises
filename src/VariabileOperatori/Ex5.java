package VariabileOperatori;

import java.util.Scanner;

public class Ex5 {

//5. [LIVE] Determina daca un utilizator se poate loga in aplicatie.
//Ai la dispozitie variabilele username si password deja declarate si initializate.
//Citeste de la tastatura inputUsername si inputPassword (adica username-ul si parola pe care ti le da utilizatorul).
//Apoi, determina daca ce a introdus utilizatorul este acelasi lucru cu username-ul si parola existente.
//Foloseste variabila isUserLoggedIn care sa retina daca utilizatorul s-a logat, sau nu, in aplicatie.


    public static void main(String[] args) {

        // declaram si initializam variabilele username si password

        String username = "admin";
        String password = "1234";

      // citim de la tastatura inputusername si inputpassword

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu username-ul:");
        String inputUsername = scanner.nextLine();
        System.out.println("Introdu parola:");
        String inputPassword = scanner.nextLine();

        // variabila care retine daca utilizatorul s-a logat sau nu

        boolean isUserLodggedIn = false;

      // verificam daca ce a introdus utilizatorul este corect

        if (inputUsername.equals(username) && inputPassword.equals(password) ){
            isUserLodggedIn = true;
            }
        // afisam mesajul corespunzator

        if (isUserLodggedIn){
            System.out.println("Utilizatorul sa logat cu scuces.");

        } else {
            System.out.println("Username sau parola incorecta.");

        }
        scanner.close();


    }


    }



