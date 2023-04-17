package hoja.de.trabajo.pkg5;
import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void matriz(){
        
        int n, m, random = 0;
        Scanner sc3 = new Scanner(System.in);
        
        System.out.println("Ingrese el valor para el número de filas: ");
        n = sc3.nextInt();
        System.out.println("Ingrese el valor para el número de columnas: ");
        m = sc3.nextInt();
        
        int matriz [][] = new int [n][m];
        
        //Lleando de matriz
        for (int i = 0; i < n; i++) {
            

            for (int j = 0; j < m; j++) {
              
                random = (int) (Math.random()*999+1);
                matriz [i][j] = random;
                
            }
            
        }
        
        //Impresión de matriz
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
              
                System.out.print(matriz[i][j]+" ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    
    
}
