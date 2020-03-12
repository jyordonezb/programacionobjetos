/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un programa que imprima en consola todas las operaciones aritméticas de dos números.
        //enteros (suma, resta, multiplicación, divición, mod)
        
        Scanner entrada=new Scanner (System.in);
        
                double Numero1=0;
                double Numero2=0;
                double suma=0;
                double resta=0;
                double divi=0;
                double multi=0;
                
                
         System.out.println("ingrese el primer numero");  
         Numero1=entrada.nextDouble();
         System.out.println("ingrese el segundo numero");
         Numero2=entrada.nextDouble();
         
         suma =Numero1+Numero2;
         resta =Numero1-Numero2;
         divi =Numero1/Numero2;
         multi = Numero1*Numero2;
         
         System.out.println("la suma es : " + suma);
         System.out.println("la resta es : "+ resta);
         System.out.println("la division es : " + divi);
         System.out.println("la multiplicaion es : " + multi);
         
    }
    
}
