package hoja.de.trabajo.pkg5;
import java.util.Scanner;

public class Ejercicio_6 {
    
    public static void factorial(){
        
        int num;
        int factorialn = 1;
        
        Scanner sc6 = new Scanner(System.in);
        
        System.out.println("Ingrese un valor a sacar el factorial: ");
        num = sc6.nextInt();
        
        
        if (num > 0) {
            
            for (int i = num; i <= num && i != 0; i--) {
                
                factorialn = factorialn * i;
            }
        }
             
        System.out.println("El resultado del factorial es: " + factorialn);
        
        
        
    }
    
    
    
}
