package tarea;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menus {
    
public String menuPrincipal(){
        System.out.println("-----Bienvenido Usuario-----");
        System.out.println("| 1. Vectores           |");
        System.out.println("| 2. Listas             |");
        System.out.println("_________________________");
        return "Ingresa el número de la opción que quieras utilizar: ";
        }

public void menuDeVectores(){
 Scanner entrada = new Scanner(System.in);
 ClaseVector TablaConVectores = new ClaseVector();
 int opcion;
       do{
           System.out.println("_______Iniciaste el Menú con Vectores__________");
           System.out.println("| 1. Tabla para Alumnos                        |");
           System.out.println("| 2. Tabla para el Curso                       |");
           System.out.println("| 3. Tabla para el Grado                       |");
           System.out.println("| 4. Mostrar los Registros                     |");
           System.out.println("| 0. Finalizar Programa                        |");
           System.out.println("|______________________________________________|\n");
           System.out.print("Ingresa la opción que requieras: ");opcion = entrada.nextInt();
           
        switch(opcion){
               
         case 1 -> { 
             System.out.println("\n\n---------Ingresaste a la Tabla para Alumnos-----------");
             System.out.println("!!!Ingresa únicamente sólo el primer nombre!!!!"); 
             System.out.print( "\nNombre del Alumno: ");String nombre=entrada.next();
             System.out.print("\nAleas del Alumno (si no tiene escriba ''Inexistente''): "); String aleas=entrada.next();
             System.out.print("\nCódigo del Alumno: "); int codigoAlumno=entrada.nextInt();
             System.out.print("\nNumero de Telefónico del Alumno: "); int telefono=entrada.nextInt();
             System.out.print("\nCorreo Electrónico del Alumno: "); String correo=entrada.next();
             System.out.print(TablaConVectores.alumno(codigoAlumno, telefono, nombre,aleas,correo));
             }
          
         case 2 -> {
            System.out.println("\n\n---------Ingresaste a la Tabla para Asignación de Curso-----------");
            System.out.print("\nIngresa el Nombre del Curso: "); String NombreCurso = entrada.next();
            System.out.print("\nIngresa el Código del Curso: "); int CodigoCurso = entrada.nextInt();
            System.out.print(TablaConVectores.curso(NombreCurso,CodigoCurso));
            }
         
         case 3 -> {
            System.out.println("\n\n---------Ingresaste a la Tabla para Asignación de Grado-----------");
            System.out.print("\nIngresa el Código del Grado: "); int codigo = entrada.nextInt();
            System.out.print("\nIngresa una Descripción: ");String descripcion = entrada.next(); 
            System.out.print(TablaConVectores.grado(codigo,descripcion));
            }
         
        case 4 -> {
            TablaConVectores.mostrarTodosLosDatos();
            }
                 
        
        default ->{
                System.out.println("No es una opción válida");
                }
        
        }   
       }while (opcion !=0); 
}

public void menuDeListas(){

        ClaseLista hija = new ClaseLista();
    
    byte opcion;
    
    do{
       opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "_______Iniciaste el Menú con Vectores__________\n"
               +"1. Tabla para Alumnos\n"
               +"2. Tabla para el Curso\n"
               +"3. Tabla para el Grado\n"
               +"4. Mostrar todas las Tablas\n"  
               +"0. Finalizar Programa\n"
               +"|______________________________________________|"));
 
       switch(opcion){
           
          case 1 -> hija.tablaAlumno();
             
          case 2 -> hija.tablaCurso();
             
          case 3 -> hija.tablaGrado();
             
          case 4 -> hija.mostrarTodosLosDatos(); 
               
         case 0 -> JOptionPane.showMessageDialog(null, "Gracias Por Usar Este Programa");
             
          default -> JOptionPane.showMessageDialog(null, "No Es Una Opción Válida");    
       }
       
    }while(opcion!=0);  
}

}