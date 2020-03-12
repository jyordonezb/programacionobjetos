
import java.util.Arrays;



public class principal {
    
    public static void main(String arg[]){
        
        int division;
        int[] listaNumeros;
        
        Recursos recursos = new Recursos();
        System.out.println(recursos.Mensaje());
        System.out.println(recursos.Nota(85));
        
        division = recursos.Division(9, 3);
        if(division == -9999999){
            System.out.println("No se puede dividir entre 0!!!");
        }
        else{
            System.out.println("Resultado de la division es: "+division);
        }
        
        listaNumeros = recursos.listaNumeros(5);
        System.out.println("Lista de numeros: "+Arrays.toString(listaNumeros));
        /*
        for(int i = 0; i<listaNumeros.length; i++ ){
            System.out.println(listaNumeros[i]);
        }
        */
      
        
    
    }
    
    
    
}
