package Arrays;

public class Ex1 {

//### 1. Scrie un program care sa adune toate preturile dintr-o lista (ca mai apoi sa fie afisata suma totala in cosul de cumparaturi):
//De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 30.


    public static void main(String[] args) {

  // Definim un array de preturi

      int[] preturi ={1, 7, 3, 10, 9};

  // Initializam o variabila pe care o numim sumaTotala la 0


      int sumaTotala = 0;

  // Parcurgem fiecare elemnet din array-ul de preturi si il adauga la suma totala


     for(int i=0; i< preturi.length; i++){
         sumaTotala+= preturi[i];
     }

  // Afisarea sumei totale


        System.out.println("Suma totala in cosul de cumparaturi este:"+ sumaTotala);









    }





}

