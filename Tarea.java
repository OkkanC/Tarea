package tarea;

import java.util.Scanner;

public class Tarea {
    
    public static void main(String[] args) {
        
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Menus padre = new Menus();
        Menus TablaConVectores = new Menus();
        
        System.out.print(padre.menuPrincipal()); opcion=entrada.nextInt();
        
        switch(opcion){
        
            case 1 -> TablaConVectores.menuDeVectores();
            
            case 2 -> {
                TablaConVectores.menuDeListas();
            }
            
            default -> System.out.println("No es una opción válida");
        }
    }
}
