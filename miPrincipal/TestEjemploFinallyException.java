package miPrincipal;

import java.util.Scanner;

public class TestEjemploFinallyException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
          
            System.out.print("Introduce valor de divisor:");
            int a = entrada.nextInt();
            System.out.print("Introduce valor de dividendo:");
            int b = entrada.nextInt();
            int resultado = a/b;
            System.out.println("Resultado de la division: "+resultado);
       

        
    }
    
}
