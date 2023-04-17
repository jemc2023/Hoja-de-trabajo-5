package hoja.de.trabajo.pkg5;
import java.util.Scanner;


public class Ejercicio_5 {
    
    public static void contadordepiezas(){
    
        int c1 = 0, c2 = 0, c3 = 0, contador = 0;
        double pieza;
        
        Scanner sc5 = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la pieza (en kg): ");
        
        while (true) {            
            
            pieza = sc5.nextDouble();
            
            if (pieza == 0) {
                
                break;
            } 
            else {
                
                contador++;
                if (pieza > 10.2) {
                    
                    c1++;
                } 
                else if (pieza < 9.8){
                    
                    c3++;
                }
                else {
                    c2++;
                }
                
                System.out.println("Ingrese el peso de otra pieza (en kg): ");
            }
            
        }
        if (contador == 0) {
            
            System.out.println("\nLa cantidad de total de piezas procesadas fue de: "+contador);
            
        } else {
            
            System.out.println("La cantidad de piezas que pesan más de 10.2 Kg. son: "+c1);
            System.out.println("La cantidad de piezas que pesan entre 9.8 Kg. y 10.2 Kg. son: "+c2);
            System.out.println("La cantidad de piezas que pesan menos de 9.8 Kg. son: "+c3);
            System.out.println("\nLa cantidad de total de piezas procesadas fue de: "+contador);
            
        }
        
    }
    
    
}
