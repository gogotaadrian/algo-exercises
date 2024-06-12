package VariabileOperatori;

public class Ex2 {

//2. Scrie un program care sa interschimbe valorile a doua variabile de tip int
//De exemplu, pentru valorile initiale:
//int a = 10;
//int b = 20;
//ar trebui sa se afiseze in consola valoarea 20 cand il printezi pe a, si valoarea 10 cand il printezi pe b

    public static void main(String[] args) {

   int a =10;
   int b =20;

 // afisam valorile initiale

        System.out.println("Valorile initiale:");
        System.out.println("a="+ a);
        System.out.println("b="+b);

// interschimbam valoarea folosind o variabila temporara

        int temp = a;
        a = b;
        b = temp;

// afisam valorile dupa interschimbare

        System.out.println("Valorile dupa interschimbare:");
        System.out.println("a="+a);
        System.out.println("b="+b);







    }




}

