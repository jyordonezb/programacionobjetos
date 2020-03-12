

public class main {
 
    public static void main(String args[]){
    
    System.out.println("Iniciando programas");
    
    estudiantes persona = new estudiantes();
    persona.setNombre("Jose Yovany");
    persona.setApellido("Ordonez");
    persona.setCarrera("Ingenieria en Sistemas");
    persona.setTrabajo("ARGOS");
    
    //System.out.println("Mi nombre es: "+persona.getNombre());
    
    String[][] estudiantesInfo = {{"jose","ordonez","sistemas","argos"},
                                  {"romel","gonzales","administracion","argos"},
                                 {"cesar","ordonez","lenguas","argos"},
                                 {"ana","romero","industrial","manpower"},
                                 {"tania","funez","arquitecto","argos"}};
    
    System.out.println("tamano arreglo lineas: "+estudiantesInfo.length);
    System.out.println("tamano arreglo columnas: "+estudiantesInfo[0].length);
    
        for(int x = 0; x < estudiantesInfo.length; x++){
            for(int y = 0; y<estudiantesInfo[x].length; y++){            
                System.out.println("valores arreglo: "+estudiantesInfo[x][y]);            
            }
            System.out.println("----------------------------------");
        } 
    }
}
