package Methods;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex1 {
// 1. Creeaza o metoda numita hasEqualSum(), care primeste 3 parametri reprezentand numere intregi.
//Metoda va returna true daca suma primilor 2 parametri este egala cu cel de-al 3-lea.
//De exemplu:
//apelul de metoda cu parametri 1,1,1, adica hasEqualSum(1, 1, 1) va returna  false pentru ca 1 + 1 (suma primilor 2 parametri)
// nu este egal cu 1 (al 3-lea parametru)
//apelul de metoda cu parametri 1,1,2, adica hasEqualSum(1, 1, 1) va returna  true pentru ca 1 + 1 (suma primilor 2 parametri)
// este egal cu 2 (al 3-lea parametru)
//Defineste metoda (impreuna cu parametri necesari), implementeaz-o, si apoi apeleaz-o in main().

// Definim metoda hasEqualSum
     public static boolean hasEqualSum (int a, int b, int c){

// Verificam daca suma primilor doi parametri este egala cu al treilea parametru

    if (a+b==c){
    return true;
    }else {
        return false;


    }
}
     // Apelam metoda cu diferiti parametri
     public static void main(String[] args) {
         System.out.println(hasEqualSum(1, 1, 1));
         System.out.println(hasEqualSum(1, 1, 2));
         System.out.println(hasEqualSum(2, 2, 4));
         System.out.println(hasEqualSum(0, 0, 0));

                  }
     }
