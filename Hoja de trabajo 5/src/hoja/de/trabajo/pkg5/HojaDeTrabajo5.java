package hoja.de.trabajo.pkg5;
import java.util.Scanner;


public class HojaDeTrabajo5 {

    
    public static void main(String[] args) {
        
        int opcion;
        boolean verificador = false;
        Scanner scd = new Scanner(System.in);
        
        System.out.println("Escoga el número de ejercicio al cual se quiere dirigir: ");
        System.out.println("(Escoga un número del 1 al 6)");
                
        do {            
           
           opcion = scd.nextInt();
            
           switch (opcion) {
            case 1:
                
                //Ejercicio 1 
                Ejercicio_1.login();
                verificador = true;
                break;
                
            case 2:
                
                //Ejercicio 2
                Ejercicio_2.operaciones();
                verificador = true;
                break;
                
            case 3:
                
                //Ejercicio 3
                Ejercicio_3.matriz();
                verificador = true;
                break;
                
            case 4:
                
                //Ejercicio 4
                Ejercicio_4.promedio();
                verificador = true;
                break;
                
            case 5:
                
                //Ejercicio 5
                Ejercicio_5.contadordepiezas();
                verificador = true;
                break;
                
            case 6:
                
                //Ejercicio 6
                Ejercicio_6.factorial();
                verificador = true;
                break;
                
            default:
                
                System.out.println("Por favor solamente escoga un número de los mostrados anteriormente: ");
            } 
   
        } while (verificador == false);
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
