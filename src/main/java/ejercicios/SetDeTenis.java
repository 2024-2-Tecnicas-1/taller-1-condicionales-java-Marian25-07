package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
      /*  if (numVictoriasA> 7 || numVictoriasB> 7 || (numVictoriasA < 0 || numVictoriasB < 0 || (numVictoriasA > 6 && numVictoriasB > 6 || (numVictoriasA >= 7 && numVictoriasB < 5 || (numVictoriasB >=7 && numVictoriasA <5
    ))))){
            return "Inválido";
        }*/
        if (numVictoriasA < 0 || numVictoriasB < 0 || numVictoriasA > 7 || numVictoriasB > 7  || 
        (numVictoriasA == 7 && numVictoriasB < 5) || (numVictoriasB == 7 && numVictoriasA< 5) ) {
        return "Inválido";
    }

        if ((numVictoriasA >= 6 && numVictoriasA >= numVictoriasB + 2) || 
        (numVictoriasA == 7 && numVictoriasB == 6)){
            return"Ganó A";        }

        if ((numVictoriasB >= 6 && numVictoriasB >= numVictoriasA + 2) || 
            (numVictoriasB == 7 && numVictoriasA == 6)) {
                return"Ganó B";  }
         
       if(numVictoriasA<=5 && numVictoriasB<=5){
        return "Aún no termina";}
       
        if(numVictoriasA>7 || numVictoriasB>7){
        return "Inválido";}
