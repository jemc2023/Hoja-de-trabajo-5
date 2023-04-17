package hoja.de.trabajo.pkg5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_2 {
    
    public static void operaciones(){
    
        int n1, n2, n3, n4;
        int op1, op2;
        boolean estado = false;
        
        
        while (!estado) {                      
            
            Scanner sn = new Scanner(System.in);
            
            try {
                
                System.out.println("Ingrese el primer valor: ");
                n1 = sn.nextInt();
                System.out.println("Ingrese el segundo valor: ");
                n2 = sn.nextInt();
                System.out.println("Ingrese el tercer valor: ");
                n3 = sn.nextInt();
                System.out.println("Ingrese el cuarto valor: ");
                n4 = sn.nextInt();

                op1 = n1 + n2;
                op2 = n3 * n4;

                System.out.println("El resultado de la primera operación es: " + op1);
                System.out.println("El resultado de la segunda operación es: "+ op2);
                estado = true;
                
            } 
            catch (Exception e) {
            
                JOptionPane.showMessageDialog(null,"Ingrese solo valores enteros.");
                System.out.println("_____________________________________");
                n1 = 0;
                n2 = 0;
                n3 = 0;
                n4 = 0;
                estado = false;
                
            }
            
            
        }
        
    }
    
    
}
