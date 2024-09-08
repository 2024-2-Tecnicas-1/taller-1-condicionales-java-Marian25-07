package ejercicios;
import  ejercicios.Division;


import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int dividendo, int divisor) {
        
        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        if (residuo == 0 ){
        String Valoresperado = "La división es exacta. \n"
                + "Cociente: " + cociente + "\n"
                + "Residuo: " + residuo;
       return Valoresperado; }
     else { 
     String Valoresperado = "La división no es exacta. \n"
             + "Cociente: " +cociente+ "\n"
             + "Residuo: " + residuo;
     return Valoresperado;
}
    

    }   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
        lector.close();
    }
}
