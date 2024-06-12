package Arrays;

public class Ex4 {
//4. Scrie un program care afiseaza cate numere pare sunt intr-un array.

    public static void main(String[] args) {

 // definim un array de numere intregi

        int[] numbers ={1,2,3,4,5,6,7,8,9,10};

 // initialzarea unui contor pentru numerele pare de la 0

        int evenCount = 0;

 // parcurgerea fiecarui element din array folosind un for clasic

        for(int i =0; i< numbers.length; i++){

 // daca numarul este par(numarul modulo este 0)

            if (numbers[i] % 2 ==0){

  // incrementarea  contorului

                evenCount++;


            }

        }
  // afisarea contorului


        System.out.println("Numarul de numere pare in array:"+ evenCount);







    }




}
