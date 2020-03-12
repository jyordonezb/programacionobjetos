/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionexpresiones;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class EvaluacionExpresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dadas las variables de tipo int M = 6, T = 1, K = -10  
        //indicar si la evaluación de estas expresiones daría como resultado
        //verdadero o falso:
        //M > T
        //T / K == -5
        //(M+T == 7) || (M-T == 5)
        
        Scanner entrada=new Scanner (System.in);
        
        
        int M = 6;
        int T = 1;
        int K = -10;
        
        
        
       
        
       if (M>T){
           System.out.println("M es mayor que T : es verdadero  ");
       } 
        
       else{
           System.out.println("M es menor que T: es Falso ");
       }
       
       if (T / K == -5){
           System.out.println("T / K == -5: es Verdadero");
       }
       else{
           System.out.println("T / K == -5: es Falso");
       }
       
       if (M+T == 7) if (M-T == 5){
           System.out.println("(M+T == 7) || (M-T == 5): es Verdadero ");    
    }
       else {
           System.out.println("(M+T == 7) || (M-T == 5): es Falso ");
       }
    }
    
}
