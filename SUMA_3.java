
/**
 * Write a description of class SUMA_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SUMA_3
{
      public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    int suma = 0;
    int numero = 0;
    
    for (int i = 0; i < 3; i++){
        
        System.out.print("\n ingrese el numero " + (i + 1) + " \n ");
        numero=entrada.nextInt ();
        suma = suma + numero;
    } 
    
    System.out.print ("La suma de los tres numeros es: " + suma);
    }
}
    
 
