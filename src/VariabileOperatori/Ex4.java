package VariabileOperatori;

public class Ex4 {

// ### 4. Scrie un program care converteste din grade Fahrenheit in grade Celsius
//De exemplu, pentru valoarea initiala:
//int temperature = 95
//programul ar trebui sa afiseze in consola valoarea 35 (valoarea in grade celsius)

// Varianta de conversie  directa in main


    public static void main(String[] args) {

// Definim variabila temperatura cu valoare  in Fahrenheit


     int temperatura = 95;

// Conversie din Fahrenheit in Celsius folosindune de conversie

     int celsius = (temperatura -32)* 5/9;

// Afisam rezultatul

        System.out.println("Temperatura in grade Celsius este:"+celsius );

    }




}
