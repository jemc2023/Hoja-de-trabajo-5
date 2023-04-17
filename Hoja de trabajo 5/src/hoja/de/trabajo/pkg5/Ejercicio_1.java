package hoja.de.trabajo.pkg5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    
    public static void login(){
    
        String contraseña, lcontraseña, usuario, lusuario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario a registrar: ");
        usuario = sc.nextLine();
        System.out.println("Ingrese la contraseña a registrar: ");
        contraseña = sc.nextLine();
        System.out.println("_____________________________________");
             
        
        while (true) {            
            
            System.out.println("Ingrese el usuario a iniciar sesión: ");
            lusuario = sc.nextLine();
            System.out.println("Ingrese la contraseña para iniciar sesión");
            lcontraseña = sc.nextLine();
            
            
            if (lusuario.equals(usuario) && lcontraseña.equals(contraseña)) {
            
            JOptionPane.showMessageDialog(null,"El inicio de sesión se ha realizado con éxito. ");
            break;
            }
            else {
                
                JOptionPane.showMessageDialog(null,"El usuario o contraseña es incorrecto. ");
                System.out.println("_____________________________________");
            }
            
        }
    
    }
    
}
