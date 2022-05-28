package tarea;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClaseLista extends ClaseDatos {
    
   ArrayList<ClaseDatos> listaAlumnos = new ArrayList();
   ArrayList<ClaseDatos> listaCurso = new ArrayList();
   ArrayList<ClaseDatos> listaGrado = new ArrayList();
   ArrayList<ClaseDatos> lista = new ArrayList();
   
   public String Input(String texto){
      return JOptionPane.showInputDialog(texto);
   }
    
     public void tablaAlumno(){
     String nombre = Input("Nombre del Alumno: ");
     String aleas = Input("Aleas del Alumno: ");
     String codigo = Input("Código del Alumno: ");
     String telefono = Input("Número de Telefónico: ");
     String correo = Input("Correo Electrónico: ");
     
     ClaseDatos lista1 = new ClaseDatos();
     
     lista1.setNombre(nombre);
     lista1.setAleas(aleas);
     lista1.setCodigo(codigo);
     lista1.setTelefono(telefono);
     lista1.setCorreo(correo);
     listaAlumnos.add(lista1);
     lista.add(lista1);
   }
   
     public void tablaCurso(){
     String NombreCurso = Input("Ingresa el Nombre del Curso:");
     String CodigoCurso = Input("Ingresa el Código del Curso ");
     
     ClaseDatos lista2 = new ClaseDatos();
     
     lista2.setCodigoCurso(CodigoCurso);
     lista2.setNombreCurso(NombreCurso);
     listaCurso.add(lista2);
     lista.add(lista2);
   }
      
     public void tablaGrado(){
     String CodigoGrado = Input("Ingresa el Código del Grado: ");
     String descripcion = Input("Ingresa Una Descripción ");
     
     ClaseDatos lista3 = new ClaseDatos();
     
     lista3.setCodigoGrado(CodigoGrado);
     lista3.setDescripcion(descripcion);
     listaGrado.add(lista3);
     lista.add(lista3);
   }
   
    public void mostrarTodosLosDatos(){
      String string="";
      for(int i=0;i<lista.size();i++){
         string+="\n--- Todas las Tablas ---\n";
         string+="Nombre: "+lista.get(i).getNombre()+"\n";
         string+="Aleas: "+lista.get(i).getAleas()+"\n";
         string+="Código: "+lista.get(i).getCodigo()+"\n";
         string+="Número Telefónico: "+lista.get(i).getTelefono()+"\n";
         string+="Correo: "+lista.get(i).getCorreo()+"\n";
         string+="Nombre del Curso: "+lista.get(i).getNombreCurso()+"\n";
         string+="Código del Curso: "+lista.get(i).getCodigoCurso()+"\n";
         string+="Código del Grado: "+lista.get(i).getCodigoGrado()+"\n";
         string+="Descripción del Grado: "+lista.get(i).getDescripcion()+"\n";
      }
      JOptionPane.showMessageDialog(null, string);
   }
}
