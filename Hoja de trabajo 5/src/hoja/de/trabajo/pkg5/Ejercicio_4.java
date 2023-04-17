package hoja.de.trabajo.pkg5;
import java.util.Scanner;

public class Ejercicio_4 {
    
    public static void promedio(){
    
        double p1, p2, p3, p4, promedio;
        Scanner sc4 = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del primer parcial: ");
        p1 = sc4.nextFloat();
        System.out.println("Ingrese la nota del segundo parcial: ");
        p2 = sc4.nextFloat();
        System.out.println("Ingrese la nota del tercel parcial: ");
        p3 = sc4.nextFloat();
        System.out.println("Ingrese la nota del cuarto parcial: ");
        p4 = sc4.nextFloat();
        
        promedio = (p1+p2)*0.2 + 0.3*(p3+p4);
        
        if (promedio >= 85) {
            
            System.out.println("Usted ha sacado un excelente promedio.");
        } 
        else if (promedio >= 80 && promedio <= 84){
            
            System.out.println("Usted ha sacado un promedio muy bueno.");
        }
        else if (promedio >= 70 && promedio <= 79){
            
            System.out.println("Usted ha sacado un buen promedio. ");
        }
        else if (promedio >= 60 && promedio <= 69){
            
            System.out.println("Usted ha sacado un promeido regular. ");
        }
        else {
            System.out.println("Usted debe de repetir el curso :( ");
        }
        
    }
    
    
}
