package Arrays;

public class Ex2 {

// 2. Scrie un program care afiseaza numerele pare dintr-un array.
// Dupa ce rezolvi direct in main, poti scrie o metoda care sa rezolve problema.
// Metoda ta va apela la randul ei (pe parcursul algoritmului) alta metoda scrisa tot de tine care verifica daca un numar este par


// Creeam un array de numere intregi daca nu ne da din problema bagam din burta

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

// Afisam numerele pare din array folosind metoda printEvenNumbers

       printEvenNumbers(numbers);

    }

// Metdoa care verifica daca un numar este par

   public static boolean isEven(int number){

        return number % 2 == 0;

   }
// Metoda care sa afiseze numerle pare dintr-un array

    public static void printEvenNumbers(int[] numbers){
     for(int number : numbers){
      if (isEven(number)){
          System.out.println(number);
      }
     }

    }




}

