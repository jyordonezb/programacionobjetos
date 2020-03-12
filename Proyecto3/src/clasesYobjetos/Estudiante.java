
package clasesYobjetos;

public class Estudiante {
   private String nombre;
   private String apellido;
   private int edad;
   private String carrera;
   
   public String getNombre(){
        return nombre;
   }
      public String getApellido(){
        return apellido;
      }
   public int getEdad(){
        return edad;
    }
       public String getSexo(){
        return carrera;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.carrera = carrera;
    }


}
