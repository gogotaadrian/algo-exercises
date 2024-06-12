package Arrays;

public class Ex3 {

//3. Scrie un program care afiseaza suma numerelor pare dintr-un array.
//Dupa ce rezolvi direct in main, poti scrie o metoda care sa rezolve problema.
// Metoda ta va apela la randul ei (pe parcursul algoritmului) alta metoda scrisa tot de tine care verifica daca un numar este par

 // Prima varianta de rezolvare direct in main

 // Definim un array de numere intregi

    public static void main(String[] args) {

        int[] numere = {1,2,3,5,6};

// Initializam o variabila pentru a tine suma numerelor pare

        int sumaPare = 0;

// Parcrugem fiecare element din array

        for (int i = 0; i< numere.length; i++){
            if (numere[i] % 2 == 0 ){
                sumaPare += numere[i];

            }
        }
// Afisam suma numerelor pare

        System.out.println("Suma numerelor pare este:" + sumaPare);


    }


}

// Varianta cu metoda

// public class Main {
//    public static void main(String[] args) {
  //      // Definim un array de numere intregi
    //    int[] numere = {1, 2, 3, 4, 5, 6};
//
        // Apeleaza metoda sumOfEvenNumbers si afiseaza rezultatul
  //      int sumaPare = sumOfEvenNumbers(numere);
    //    System.out.println("Suma numerelor pare este: " + sumaPare);
   // }

    // Definim metoda isEven care primeste un numar intreg si returneaza adevarat daca numarul este par
    //public static boolean isEven(int numar) {
     //   return numar % 2 == 0;
    //}

    // Definim o metoda sumOfEvenNumbers care primeste un array de numere intregi si returneaza suma numerelor pare
    //public static int sumOfEvenNumbers(int[] numere) {
      //  int suma = 0;
       // for (int i = 0; i < numere.length; i++) {
         //   if (isEven(numere[i])) {
          //      suma += numere[i];
            //}
        //}
        //return suma;
    //}
//}