package tarea;

public class ClaseVector {
    private String[] paraDatos, tablaAlumnos, tablaCurso, tablaGrado;
    private int indice, indiceAlumnos, indiceCurso, indiceGrado;
    
    public ClaseVector(){
        paraDatos= new String[100];
        this.indice=0;
        tablaAlumnos= new String[100];
        this.indiceAlumnos=0;
        tablaCurso= new String[100];
        this.indiceCurso=0;
        tablaGrado= new String[100];
        this.indiceGrado=0;
 
     }
    
    public String alumno (int codigo, int telefono, String nombre, String aleas, String correo){
        String resultado = "";
        this.tablaDeAlumno(" ",nombre,resultado, codigo, "", telefono,"",aleas,"",correo);
        return "\n_________________________________\n       Tabla del Alumno        \nNombre del alumno: "+nombre+". \nAleas: "+aleas+". \nCódigo: "+codigo+". \nNúmero Telefónico: "+telefono +". \nCorreo Electrónico: " +correo+"\n_________________________________\n\n\n";
    }
    
    private void tablaDeAlumno(String hayTexto, String nombre, String resultado, int codigo, String hayTexto2, int telefono, String hayTexto3, String aleas, String hayTexto4, String correo) {
        indice= indice+1;
        indiceAlumnos= indiceAlumnos+1;
        paraDatos[indice]= "\n_________________________________\n       Tabla del Alumno        \nNombre del alumno: "+nombre+". \nAleas: "+aleas+". \nCódigo: "+codigo+". \nNúmero Telefónico: "+telefono +". \nCorreo Electrónico: " +correo+"\n_________________________________\n\n\n";             
        tablaAlumnos[indiceAlumnos]= "\n_________________________________\n       Tabla del Alumno        \nNombre del alumno: "+nombre+". \nAleas: "+aleas+". \nCódigo: "+codigo+". \nNúmero Telefónico: "+telefono +". \nCorreo Electrónico: " +correo+"\n_________________________________\n\n\n"; 
    }
        
    public String curso (String NombreCurso, int CodigoCurso){
        String resultado = "";
        this.tablaDeCurso(" ", NombreCurso,"", CodigoCurso,"", resultado);
        return "\n_________________________________\n       Tabla del Curso        \nSe ha asignado al Curso de:: "+NombreCurso+".\nCódigo del Curso: "+CodigoCurso+"\n_________________________________\n\n\n";
    }
    
    private void tablaDeCurso(String hayTexto, String NombreCurso, String hayTexto2, int CodigoCurso, String hayTexto3, String hayTexto4) {
      indice= indice+1;
      indiceCurso= indiceCurso+1;
      paraDatos[indice]= "\n_________________________________\n       Tabla del Curso        \nSe ha asignado al Curso de:: "+NombreCurso+".\nCódigo del Curso: "+CodigoCurso+"\n_________________________________\n\n\n";
      tablaCurso[indiceCurso]= "\n_________________________________\n       Tabla del Curso        \nSe ha asignado al Curso de: "+NombreCurso+".\nCódigo del Curso: "+CodigoCurso+"\n_________________________________\n\n\n";
    }
             
    public String grado (int codigo, String descripcion){
        String resultado = "";
        this.tablaDeGrado(" ", codigo,""+descripcion);
        return "\n_________________________________\n       Tabla del Grado        \nEl Código del Grado es: "+codigo+".\nSu descripción: "+descripcion+".\n_________________________________\n\n\n";
    }
        
    private void tablaDeGrado(String hayTexto, int codigo, String descripcion) {
      indice= indice+1;
      indiceGrado= indiceGrado+1;
      paraDatos[indice]= "\n_________________________________\n       Tabla del Grado        \nEl Código del Grado es: "+codigo+".\nSu descripción: "+descripcion+".\n_________________________________\n\n\n";
      tablaGrado[indiceGrado]= "\n_________________________________\n       Tabla del Grado        \nEl Código del Grado es: "+codigo+".\nSu descripción: "+descripcion+".\n_________________________________\n\n\n"; 
    }

    public void mostrarTodosLosDatos(){
        try{       
            for (int i=1; i<paraDatos.length;i++){
                if(paraDatos[i] != null){
                    System.out.println(paraDatos[i]);
                }
            }
            for(String registro : paraDatos){
                if(registro != null){  
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
    
}
