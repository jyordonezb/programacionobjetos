
public class Recursos {
    
    String mensaje = "Estoy aprendiendo, pero seré el mejor programador del mundo";
    String nota;
    int division;
    
    public Recursos(){
    
    }
    
    public String Mensaje(){
        return this.mensaje;
   }
    
   public String Nota(int nota){       
       if(nota < 70){
           this.nota = "REPROBADO";
       }
       else if(nota > 70 && nota < 100){
            this.nota = "APROBADO";
       }
       else{
           this.nota = "Calificaion Incorrecta!!";
       }
       return this.nota;
   } 
   
   public int Division(int a, int b){ 
       if(b == 0){
           return -9999999;
       }
       else{
           division = a/b;
       }
       return division;
   }
   
   public int[] listaNumeros(int x){
       int[] listaNumeros = new int[x+1];
       int i = 0;
       while(i <= x)
       {
          //System.out.println("Incrementador es: "+i);
          listaNumeros[i] = i; 
          i = i+1; 
       }
       
       
       return listaNumeros;
   }
    
    
    
}
