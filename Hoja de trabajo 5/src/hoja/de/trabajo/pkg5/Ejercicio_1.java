package hoja.de.trabajo.pkg5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    
    public static void login(){
    
        String contrase�a, lcontrase�a, usuario, lusuario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario a registrar: ");
        usuario = sc.nextLine();
        System.out.println("Ingrese la contrase�a a registrar: ");
        contrase�a = sc.nextLine();
        System.out.println("_____________________________________");
             
        
        while (true) {            
            
            System.out.println("Ingrese el usuario a iniciar sesi�n: ");
            lusuario = sc.nextLine();
            System.out.println("Ingrese la contrase�a para iniciar sesi�n");
            lcontrase�a = sc.nextLine();
            
            
            if (lusuario.equals(usuario) && lcontrase�a.equals(contrase�a)) {
            
            JOptionPane.showMessageDialog(null,"El inicio de sesi�n se ha realizado con �xito. ");
            break;
            }
            else {
                
                JOptionPane.showMessageDialog(null,"El usuario o contrase�a es incorrecto. ");
                System.out.println("_____________________________________");
            }
            
        }
    
    }
    
}
